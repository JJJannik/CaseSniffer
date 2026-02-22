package de.jjjannik.dao.mapper;

import de.jjjannik.classes.Case;
import de.jjjannik.classes.entities.ValueEntity;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ValueEntityMapper implements RowMapper<ValueEntity> {

    @Override
    public ValueEntity map(ResultSet rs, StatementContext ctx) throws SQLException {
        return new  ValueEntity(
                Case.getByName(rs.getString("itemType")),
                rs.getDouble("value")
        );
    }
}