package de.jjjannik.dao;

import de.jjjannik.classes.Case;
import de.jjjannik.classes.entities.SkinEntity;
import de.jjjannik.classes.entities.ValueEntity;
import de.jjjannik.dao.mapper.ValueEntityMapper;
import de.jjjannik.utils.CsSnifferConfiguration.DataSource;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindMethods;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

public interface CaseSnifferDao {

    @SqlUpdate("CREATE TABLE IF NOT EXISTS `itemIds` (`itemType` VARCHAR(16) NOT NULL, `skin` VARCHAR(20) NOT NULL DEFAULT '', `wear` VARCHAR(16) NOT NULL DEFAULT '', `isStatTrak` INTEGER NOT NULL DEFAULT -1, `id` INTEGER NOT NULL PRIMARY KEY, UNIQUE(itemType, skin, wear, isStatTrak));")
    void createItemIdTable();

    @SqlUpdate("CREATE TABLE IF NOT EXISTS `steamIds` (itemId INTEGER NOT NULL PRIMARY KEY, steamId INTEGER NOT NULL, FOREIGN KEY (itemId) REFERENCES itemIds(id));")
    void createSteamIdsTable();

    @SqlUpdate("CREATE TABLE IF NOT EXISTS `casePrices` (`itemId` INTEGER NOT NULL, `price` INTEGER NOT NULL, `dataSource` VARCHAR(16) NOT NULL, `time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL, FOREIGN KEY(itemId) REFERENCES itemIds(id), UNIQUE(itemId, dataSource));")
    void createCasePriceTable();

    @SqlUpdate("CREATE TABLE IF NOT EXISTS `skinPrices` (`itemId` INTEGER NOT NULL, `price` INTEGER NOT NULL, `dataSource` VARCHAR(16) NOT NULL, `time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL, FOREIGN KEY(itemId) REFERENCES itemIds(id), UNIQUE(itemId, dataSource));")
    void createSkinPriceTable();

    @SqlUpdate("CREATE TABLE IF NOT EXISTS `expValues` (`itemId` INTEGER NOT NULL, `value` REEL NOT NULL, `roi` REEL NOT NULL, `dataSource` VARCHAR(16) NOT NULL, `time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL, FOREIGN KEY(itemId) REFERENCES itemIds(id), UNIQUE(itemId, dataSource));")
    void createExpectedValueTable();

    @SqlUpdate("INSERT INTO `itemIds` (itemType, skin, wear, isStatTrak) VALUES (:getItemType.getValue, :getSkin.getName, :getWear.getValue, :isStatTrak) ON CONFLICT(itemType, skin, wear, isStatTrak) DO NOTHING;")
    void addItem(@BindMethods SkinEntity skin);

    @SqlUpdate("INSERT INTO `itemIds` (itemType) VALUES (:getValue) ON CONFLICT(itemType, skin, wear, isStatTrak) DO NOTHING;")
    void addItem(@BindMethods Case cCase);

    @SqlQuery("SELECT `id` FROM `itemIds` WHERE itemType = :getItemType.getValue AND skin = :getSkin.getName AND wear = :getWear.getValue AND isStatTrak = :isStatTrak;")
    Long getItemId(@BindMethods SkinEntity skin);

    @SqlQuery("SELECT `id` FROM `itemIds` WHERE itemType = :getValue;")
    Long getItemId(@BindMethods Case cCase);

    @SqlUpdate("INSERT INTO `steamIds` (itemId, steamId) VALUES (:item, :steam) ON CONFLICT(itemId) DO UPDATE SET steamId = :steam;")
    void setSteamId(@Bind("item") long itemId, @Bind("steam") long steamId);

    @SqlQuery("SELECT `steamId` FROM `steamIds` WHERE itemId = ?;")
    Long getSteamId(@Bind long itemId);

    @SqlUpdate("INSERT INTO `casePrices` (itemId, price, dataSource) VALUES(:id, :price, :ds) ON CONFLICT(itemId, dataSource) DO UPDATE SET price=:price;")
    void setCasePrice(@Bind("id") long id, @Bind("price") int price, @Bind("ds") DataSource dataSource);

    @SqlQuery("SELECT `price` FROM `casePrices` WHERE itemId=? AND dataSource=?;")
    Integer getCasePrice(@Bind long id, @Bind DataSource dataSource);

    @SqlUpdate("INSERT INTO `skinPrices` (itemId, price, dataSource) VALUES(:id, :price, :ds) ON CONFLICT(itemId, dataSource) DO UPDATE SET price=:price;")
    void setSkinPrice(@Bind("id") long id, @Bind("price") int price, @Bind("ds") DataSource dataSource);

    @SqlQuery("SELECT `price` FROM `skinPrices` WHERE itemId=? AND dataSource=?;")
    Integer getSkinPrice(@Bind long id, @Bind DataSource dataSource);

    @SqlUpdate("INSERT INTO expValues (itemId, value, roi, dataSource) SELECT :id, :value, :roi, :ds WHERE EXISTS (SELECT 1 FROM casePrices WHERE itemId = :id) ON CONFLICT(itemId, dataSource) DO UPDATE SET value = :value, roi = :roi;")
    void setExpectedVal(@Bind("id") long id, @Bind("value") double value, @Bind("roi") double roi, @Bind("ds") DataSource dataSource);

    @RegisterRowMapper(ValueEntityMapper.class)
    @SqlQuery("SELECT e.value, e.roi, i.itemType, e.time FROM expValues e JOIN itemIds i ON e.itemId = i.id WHERE e.dataSource = ? ORDER BY e.roi DESC;")
    List<ValueEntity> getExpectedValuesSorted(@Bind DataSource dataSource);
}