package beantest.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config2 {
    public Config2() {
        System.out.println("Config2 생성");
    }

    @Bean
    public Apple getApple() {
        return new Apple("풋사과", "맛있음");
    }
}
