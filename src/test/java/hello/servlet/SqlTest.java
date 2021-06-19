package hello.servlet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.jdbc.Sql;

@SpringBootTest
@Profile("test")
@Sql("classpath:static/init.sql")
public class SqlTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void name() {
        jdbcTemplate.update("INSERT INTO user VALUES ('pomo', '200')");
        Integer result = jdbcTemplate.queryForObject("select COUNT(*) from user", Integer.class);
        System.out.println("결과 출력 :: " + result);
    }
}
