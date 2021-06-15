package beantest.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config2 {

    @Bean
    public Apple getApple() {
        return new Apple("풋사과", "맛있음");
    }
}
