package org.sostapis.springdataexamplesh2.coche.repository;

import org.sostapis.springdataexamplesh2.coche.model.Coche;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class CocheRowMapper implements RowMapper<Coche> {

    @Override
    public Coche mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Coche(
                rs.getLong("id"),
                rs.getString("marca"),
                rs.getString("matricula"),
                rs.getString("nacionalidad"),
                rs.getInt("puertas"),
                rs.getBigDecimal("precio"),
                rs.getDouble("consumo")
        );
    }

}
