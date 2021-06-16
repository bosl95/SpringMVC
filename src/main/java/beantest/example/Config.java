package beantest.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    public Config() {
        System.out.println("Config 클래스 생성");
    }

    @Bean
    public Address getAddress() {
        return new Address("서울시", 10101);
    }

    @Bean
    public Dog getDog() {
        return new Dog();
    }
}

