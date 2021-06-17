package beantest.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackageClasses = Company.class)
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

