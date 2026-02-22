# CS2 CaseSniffer

The CaseSniffer is a Java CLI program that allows you to fetch data from the [Steam Market](https://steamcommunity.com/market/search?appid=730) 
and/or the [CSFloat Market](https://csfloat.com/search) to calculate which CS2 Case is the best considering its price and possible returns.<br>
Via the command line you can afterward update skin or case prices, so you always can check for ongoing changes in the market.<br>
For **43 cases** and **2195 items** distributed over these, resulting in **10'601** possible outcomes for all cases, the program fetches data and calculates the expected value for each case.

## 📖 Overview

1. [Introduction](#-introduction)
2. [Limitations](#-limitations)
3. [How to Use](#-how-to-use)
4. [Getting Help](#-getting-help)
5. [Contribution](#-contribution)

## 🔬 Introduction
This CaseSniffer program tackles the question I had some months ago...<br>
What CS2 case is the most profitable? Or better to ask: Which one looses you the least amount of money?<br>
I saw the answer to this question in comparing the expected value of each case, 
a term that everyone should've heard at some point in their school time in a maths stochastics class.<br>

The principle is fairly easy: If you want to analyze how much you win/loose when gambling,
you just take the sum of every possible outcome multiplied with its probability and then subtract how much you paid for even participating.<br>
...et voilà you know how much you're going to make on average in the long run. <br>

That's everything this program does, based on data from the Steam Market and CSFloat
for each case it fetches its price and the price of every possible skin from that case, considering StatTrak-Versions, Wears (Floats & Float caps) and of course also all Gold skins in that case.<br>
It saves all this data to a local SQLite database and calculates the expected value from each case including the key price.<br>

In the beginning a goal of mine was to only use data from the Steam Market to be independent of 3rd party services, but then I encountered the problem, 
that some not to say a lot of skin prices are not representable on Steam since, Steam Market sales are capped at somewhere 1700 $ which leads to deviations.
Instead of switching just for these skins to a 3rd party trade platform, I decided to implement CSFloat as a completely new option to run the program with.
Since I still wanted independence from other platforms besides CSFloat, I had to hardcode all possible skins for every case with its float cap since there isn't really a way to get that information from CSFloat or Steam automatically.<br>

Another thing to mind is that this program does **NOT** include CS2 Souvenir Packages since they are like a whole new kind of cases with other probabilities and stuff so yeah.. for me, it just wasn't worth implementing these.

## 🤖 Limitations

### CaseSniffer limitations
First of all I want to mention that although the program accounts for float capped skins, it doesn't for special patterns, because of two main reasons:
1. You can't fetch prices for these specifically in the Steam Market, which keep in mind, was at the beginning my only desired source of data.
2. I think between 1000 different patterns, only a handful of them lead to a significant overpay, so it just averages out in the end. 

Then the program also doesn't account for Top Tier low or high floats which also lead to overpay, since again those are not relevant for calculating expected values of cases.
Not only are they not just irrelevant, they also significantly distort the actual value if e.g. the only sale offer on CSFloat is a Mil-Spec Skin Battle-Scarred #1 High float one with a high price,
therefor the program even filters those out.

### Rate limits

#### Steam

As mentioned in the beginning there are 10'601 possible outcomes when opening cases and the programm has to perform a request for each of them to fetch the price.
And if the program is using Steam as datasource it actually has to once do an extra 10k requests, 
because before you can fetch the price for an item you first need to have the according Steam id, which after fetching will be saved to the local db.

If you're not logged into a Steam account and try to perform requests after like 20-30 requests, Steam just rate limits you, so you can't fetch any more data for the next like 24h.
So the program needs a way log into a Steam account and I decided that the user has to provide a valid formatted login cookie in order to fetch the data.

When being logged in, Steam lets you do ~3000 requests every around 12h (from my experience) **AND** it also invalidates at least once every day your login session, so you have to provide the program with the new Cookie.

#### CSFloat

The CSFloat market rate limits are way more straightforward, in order to use their [Market API](https://docs.csfloat.com/#introduction), 
you need your profile to meet the requirements and then get your Developer API key.
With that key provided the program can perform **200 requests per hour**, which is also outputted by the program if the limit is reached and when it will be reset.


> [!NOTE]
> Be aware that this key is shared with your own personal activity on CSFloat, so if the programm uses your 200 request per hour, you also can't access the CSFloat market the normal way, since you're also rate limited there.

## 🏃‍♂️ How to Use

You can grab the latest built version of the programm from the Latest release: [GitHub Release](https://github.com/JJJannik/CaseSniffer/releases)

Of course, you can also build it from source yourself via Gradle.

To run the programm it's recommended to use at least Java 17 with following command `java -jar CaseSniffer.jar [OPTIONS]`.

The program itself Calculate and display expected value for each case. 
Providing no additional flags will display previous calculated expected values.

Possible options to provide the program with are:

    --steam                 Calculate expected value based on Steam data.
                            Next argument can be file path to Steam Login Cookie, if not provided program searches in directory ./CaseSniffer for 'cookies.txt'
    
    --csfloat               Calculate expected value based on CSFloat data.
                            Next argument has to be an CSFloat API key

    -i, --updateItemIds     Expected value will be calculated with updated Item Ids. Use this only, if there is a problem with the previously fetched item ids.
                            Can only be used if --steam flag is provided

    -c, --updateCasePrices  Expected value will be calculated with updated Case Prices

    -s, --updateSkinPrices  Expected value will be calculated with updated Skin Prices

    -a, --all               Expected value will be calculated with new Item Ids, Case Prices and Skin Prices. Use this if you run the programm the first time

    --debug                 Debug flag to log each skin for each case with its price, probability and therefor its expected value contribution

    -h, --help              Display this help documentary and exit the programm

> [!NOTE]
> To generate my `cookies.txt` I used the Browser Addon [ExportCookies](https://github.com/rotemdan/ExportCookies) to export for `steamcommunity.com`.<br>
> You can find an example of a generated cookies file in `/CaseSniffer/cookies.txt`

The program generates on first start the directory `./CaseSniffer` together with a `cases.db` file as SQLite database containing required tables.<br>
I recommend grabbing and using the already initialized file from this repository since it already contains all Steam Ids as of date of this commit.<br>
This way you save 10k requests, and you can start with fetching price data.

When the program is done it outputs expected values for Steam / CSFloat data in following scheme, this example is the real output based on data from 16/02/2026 - 22/02/2026

    CaseSniffer - Expected Values:
    
    |--------------------------------
    |Steam:
    |#1 Snakebite Case: -0,998731 €
    |#2 Fever Case: -1,044466 €
    |#3 Recoil Case: -1,049612 €
    |#4 Kilowatt Case: -1,071190 €
    |#5 Gallery Case: -1,075048 €
    |#6 Revolution Case: -1,125911 €
    |#7 Shadow Case: -1,160832 €
    |#8 Prisma Case: -1,207211 €
    |#9 Horizon Case: -1,278167 €
    |#10 Falchion Case: -1,339511 €
    |#11 Prisma 2 Case: -1,429039 €
    |#12 Fracture Case: -1,469483 €
    |#13 Dreams & Nightmares Case: -1,612511 €
    |#14 CS20 Case: -1,665671 €
    |#15 Operation Wildfire Case: -1,666284 €
    |#16 Clutch Case: -1,668352 €
    |#17 Revolver Case: -1,919345 €
    |#18 Chroma 2 Case: -2,099081 €
    |#19 Danger Zone Case: -2,189741 €
    |#20 Gamma Case: -2,436050 €
    |#21 Gamma 2 Case: -2,572441 €
    |#22 Chroma 3 Case: -2,612086 €
    |#23 Operation Vanguard Weapon Case: -2,715297 €
    |#24 Operation Phoenix Weapon Case: -2,937463 €
    |#25 Spectrum 2 Case: -3,021243 €
    |#26 Chroma Case: -3,074459 €
    |#27 Spectrum Case: -3,298612 €
    |#28 Shattered Web Case: -3,973230 €
    |#29 X-Ray P250 Package: -3,976476 €
    |#30 eSports 2013 Winter Case: -4,393399 €
    |#31 Operation Broken Fang Case: -4,672433 €
    |#32 Huntsman Weapon Case: -5,837685 €
    |#33 Winter Offensive Weapon Case: -5,846244 €
    |#34 Operation Breakout Weapon Case: -6,809342 €
    |#35 eSports 2014 Summer Case: -7,497939 €
    |#36 Operation Riptide Case: -9,920490 €
    |#37 CS:GO Weapon Case 3: -11,125165 €
    |#38 Glove Case: -14,979169 €
    |#39 CS:GO Weapon Case 2: -15,144086 €
    |#40 Operation Hydra Case: -23,244229 €
    |#41 Operation Bravo Case: -53,679068 €
    |#42 eSports 2013 Case: -60,669863 €
    |#43 CS:GO Weapon Case: -149,730953 €
    
    |--------------------------------
    |CSFloat:
    |#1 Revolver Case: -0,844463 €
    |#2 Horizon Case: -1,131506 €
    |#3 Gallery Case: -1,261619 €
    |#4 Snakebite Case: -1,305625 €
    |#5 Kilowatt Case: -1,387975 €
    |#6 Recoil Case: -1,394185 €
    |#7 Prisma Case: -1,394846 €
    |#8 Revolution Case: -1,423596 €
    |#9 Falchion Case: -1,433564 €
    |#10 Fever Case: -1,442538 €
    |#11 CS20 Case: -1,511854 €
    |#12 Operation Wildfire Case: -1,560340 €
    |#13 Fracture Case: -1,635439 €
    |#14 Prisma 2 Case: -1,645094 €
    |#15 Dreams & Nightmares Case: -1,682597 €
    |#16 Clutch Case: -1,692773 €
    |#17 Danger Zone Case: -1,788402 €
    |#18 Chroma 2 Case: -2,081171 €
    |#19 Chroma 3 Case: -2,185910 €
    |#20 Gamma Case: -2,368137 €
    |#21 Operation Vanguard Weapon Case: -2,403219 €
    |#22 Gamma 2 Case: -2,433609 €
    |#23 Spectrum Case: -2,459040 €
    |#24 Spectrum 2 Case: -2,515367 €
    |#25 Chroma Case: -2,549021 €
    |#26 Operation Phoenix Weapon Case: -2,713011 €
    |#27 Shattered Web Case: -2,748405 €
    |#28 Shadow Case: -3,450000 €
    |#29 Operation Broken Fang Case: -3,470161 €
    |#30 X-Ray P250 Package: -3,569247 €
    |#31 Huntsman Weapon Case: -3,911548 €
    |#32 Winter Offensive Weapon Case: -4,685782 €
    |#33 Operation Breakout Weapon Case: -4,784686 €
    |#34 eSports 2013 Winter Case: -5,877259 €
    |#35 eSports 2014 Summer Case: -6,017283 €
    |#36 Operation Riptide Case: -6,432725 €
    |#37 CS:GO Weapon Case 3: -9,183823 €
    |#38 Glove Case: -10,772901 €
    |#39 CS:GO Weapon Case 2: -13,771250 €
    |#40 Operation Hydra Case: -16,480547 €
    |#41 Operation Bravo Case: -36,731086 €
    |#42 eSports 2013 Case: -51,442176 €
    |#43 CS:GO Weapon Case: -102,139553 €
    |--------------------------------

## 🚨 Getting Help

If you experience an issue, feel free to contact me via my Discord `jjjannik` or just write a detailed issue in this repository.

## 🛠️ Contribution

If you see any kind of possible improvement in this project, feel free to either let me know about it or just do it yourself :)<br>

To contribute to the project, please fork this repository, commit your changes there and then create a pull request to be reviewed.