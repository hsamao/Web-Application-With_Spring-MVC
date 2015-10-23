package com.samao.dymcWeb.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hsamao on 10/18/15.
 */

@Component("offerDao")
public class OfferDAO {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }


    public List<Offer> getOffer() {
        return namedParameterJdbcTemplate.query("select * from offer", new RowMapper<Offer>() {
            public Offer mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                Offer offer = new Offer();

                offer.setId(resultSet.getInt("id"));
                offer.setName(resultSet.getString("name"));
                offer.setEmail(resultSet.getString("email"));
                offer.setText(resultSet.getString("text"));

                return offer;
            }

        });
    }

    /*public void create(Offer offer) {
    }*/

    public void create (Offer offer) {

        String query = "insert into offer (name, email, text) VALUES (:name, :email, :text);";

        Map namedParameters = new HashMap();

        namedParameters.put("name", offer.getName());
        namedParameters.put("email", offer.getEmail());
        namedParameters.put("text", offer.getText());

        namedParameterJdbcTemplate.update(query, namedParameters);
    }

    public Offer getOffer(int id) {

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", id);

        return namedParameterJdbcTemplate.queryForObject("select * from offer where id=:id", params,
                new RowMapper<Offer>() {

                    public Offer mapRow(ResultSet rs, int rowNum)
                            throws SQLException {
                        Offer offer = new Offer();

                        offer.setId(rs.getInt("id"));
                        offer.setName(rs.getString("name"));
                        offer.setText(rs.getString("text"));
                        offer.setEmail(rs.getString("email"));

                        return offer;
                    }

                });
    }
}
