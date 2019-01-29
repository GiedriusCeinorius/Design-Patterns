package com.gce.patterns.movietickets.DAO;

import com.gce.patterns.movietickets.entities.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDAOImpl implements TicketDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private static final String sql = "insert into ticket (movie, screen, seat) values(?, ?, ?)";


    @Override
    public void create(Ticket ticket) {
        jdbcTemplate.update(sql, ticket.getMovie(), ticket.getScreen(), ticket.getSeat());

    }
}
