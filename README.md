# CS2 CaseSniffer

The CaseSniffer is a Java CLI program that allows you to fetch data from the [Steam Market](https://steamcommunity.com/market/search?appid=730) 
and/or the [CSFloat Market](https://csfloat.com/search) to calculate which CS2 Case is the best considering its price and possible returns, so basically as well the ROI (Return of Investment) of every case.<br>
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


> [!WARN]
> Be aware that this key is shared with your own personal activity on CSFloat, so if the programm uses your 200 request per hour, you also can't access the CSFloat market the normal way, since you're also rate limited there.

## 🏃‍♂️ How to Use

You can grab the latest built version of the programm from the Latest release: [GitHub Release](https://github.com/JJJannik/CaseSniffer/releases)

Of course, you can also build it from source yourself via Gradle.

To run the programm it's recommended to use at least Java 17 with following command `java -jar CaseSniffer.jar [OPTIONS]`.

The program itself calculates and displays expected value for each case. 
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
    |#1 Snakebite Case: -0,941824 €
    |#2 Recoil Case: -0,976759 €
    |#3 Kilowatt Case: -1,043648 €
    |#4 Revolution Case: -1,059415 €
    |#5 Gallery Case: -1,098270 €
    |#6 Fever Case: -1,114443 €
    |#7 Shadow Case: -1,192893 €
    |#8 Prisma Case: -1,221434 €
    |#9 Falchion Case: -1,292774 €
    |#10 Horizon Case: -1,402961 €
    |#11 Fracture Case: -1,457864 €
    |#12 Prisma 2 Case: -1,508008 €
    |#13 Clutch Case: -1,584352 €
    |#14 Dreams & Nightmares Case: -1,594679 €
    |#15 CS20 Case: -1,635840 €
    |#16 Operation Wildfire Case: -1,715734 €
    |#17 Revolver Case: -1,863578 €
    |#18 Danger Zone Case: -2,159867 €
    |#19 Chroma 2 Case: -2,255544 €
    |#20 Gamma Case: -2,349013 €
    |#21 Operation Vanguard Weapon Case: -2,590633 €
    |#22 Gamma 2 Case: -2,650987 €
    |#23 Chroma 3 Case: -2,689781 €
    |#24 eSports 2013 Winter Case: -2,836707 €
    |#25 Operation Phoenix Weapon Case: -2,916844 €
    |#26 Chroma Case: -3,040620 €
    |#27 Spectrum 2 Case: -3,058203 €
    |#28 Spectrum Case: -3,188102 €
    |#29 X-Ray P250 Package: -3,961240 €
    |#30 Shattered Web Case: -4,033192 €
    |#31 Operation Broken Fang Case: -4,542026 €
    |#32 Winter Offensive Weapon Case: -5,203363 €
    |#33 Huntsman Weapon Case: -5,356241 €
    |#34 Operation Breakout Weapon Case: -6,728014 €
    |#35 eSports 2014 Summer Case: -7,038488 €
    |#36 Operation Riptide Case: -9,508232 €
    |#37 CS:GO Weapon Case 3: -10,564533 €
    |#38 Glove Case: -14,152495 €
    |#39 CS:GO Weapon Case 2: -14,368496 €
    |#40 Operation Hydra Case: -20,119475 €
    |#41 Operation Bravo Case: -52,407289 €
    |#42 eSports 2013 Case: -61,068455 €
    |#43 CS:GO Weapon Case: -147,199837 €
    
    |--------------------------------
    |CSFloat:
    |#1 Snakebite Case: -1,282919 €
    |#2 Gallery Case: -1,344228 €
    |#3 Recoil Case: -1,361109 €
    |#4 Kilowatt Case: -1,379923 €
    |#5 Revolution Case: -1,390952 €
    |#6 Horizon Case: -1,409741 €
    |#7 Falchion Case: -1,424425 €
    |#8 Prisma Case: -1,432412 €
    |#9 Fever Case: -1,505209 €
    |#10 Revolver Case: -1,574131 €
    |#11 Operation Wildfire Case: -1,606917 €
    |#12 CS20 Case: -1,617156 €
    |#13 Fracture Case: -1,655085 €
    |#14 Clutch Case: -1,665891 €
    |#15 Dreams & Nightmares Case: -1,690302 €
    |#16 Prisma 2 Case: -1,727802 €
    |#17 Danger Zone Case: -1,948701 €
    |#18 Chroma 2 Case: -2,224586 €
    |#19 Gamma Case: -2,319744 €
    |#20 Chroma 3 Case: -2,359391 €
    |#21 Operation Vanguard Weapon Case: -2,419202 €
    |#22 Spectrum Case: -2,454425 €
    |#23 Gamma 2 Case: -2,546867 €
    |#24 Chroma Case: -2,575457 €
    |#25 Spectrum 2 Case: -2,580353 €
    |#26 Operation Phoenix Weapon Case: -2,741883 €
    |#27 Shattered Web Case: -2,904793 €
    |#28 Shadow Case: -3,450000 €
    |#29 Operation Broken Fang Case: -3,454590 €
    |#30 X-Ray P250 Package: -3,558042 €
    |#31 Huntsman Weapon Case: -3,801951 €
    |#32 Winter Offensive Weapon Case: -4,506181 €
    |#33 Operation Breakout Weapon Case: -4,758268 €
    |#34 eSports 2013 Winter Case: -5,211548 €
    |#35 eSports 2014 Summer Case: -5,705322 €
    |#36 Operation Riptide Case: -6,500004 €
    |#37 CS:GO Weapon Case 3: -8,880679 €
    |#38 Glove Case: -9,723747 €
    |#39 CS:GO Weapon Case 2: -13,247827 €
    |#40 Operation Hydra Case: -14,597412 €
    |#41 Operation Bravo Case: -36,374853 €
    |#42 eSports 2013 Case: -51,931575 €
    |#43 CS:GO Weapon Case: -99,904455 €
    |--------------------------------

## 🚨 Getting Help

If you experience an issue, feel free to contact me via my Discord `jjjannik` or just write a detailed issue in this repository.

## 🛠️ Contribution

If you see any kind of possible improvement in this project, feel free to either let me know about it or just do it yourself :)<br>

To contribute to the project, please fork this repository, commit your changes there and then create a pull request to be reviewed.