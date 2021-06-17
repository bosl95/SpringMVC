package beantest.example;

import hello.servlet.ServletApplication;
import hello.servlet.web.springmvc.v1.SpringMemberFormControllerV1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestTemplateTest {
    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    void test() {
        assertThat(testRestTemplate).isNotNull();
    }
}
