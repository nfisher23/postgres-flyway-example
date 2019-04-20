package com.nickolasfisher.flywaystuff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class RegularWriter {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Scheduled(fixedRate = 5000)
    public void pollConsistently() {
        jdbcTemplate.execute("INSERT INTO employee (id, name) VALUES (1, 'jack')");
        jdbcTemplate.query("SELECT * FROM employee", (rs) -> {
            rs.next();
            int a = rs.getInt("id");
            System.out.println(a);
            return a;
        });
        System.out.println("writing...");
    }


}
