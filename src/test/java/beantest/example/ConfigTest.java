package beantest.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = {Config2.class})
@Import(Config3.class)
class ConfigTest {
    @Autowired
    Apple apple;

    @Test
    void name() {
        assertThat(apple.getName()).isEqualTo("청사과");
    }
}

@TestConfiguration
class Config3 {

    public Config3() {
        System.out.println("Config3 생성");
    }

    // Config2의 Apple의 빈을 재등록한다.
    @Bean
    public Apple apple() {
        return new Apple("청사과", "존맛탱");
    }
}

