package beantest.example;

import org.springframework.stereotype.Component;

@Component
public class Entity {
    public Entity() {
        System.out.println("Entity 생성");
    }
}
