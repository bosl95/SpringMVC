package hello.example;

import org.springframework.stereotype.Component;

@Component
public class Building {
    private String name;
    private int age;

    public Building() {
        this("루터회관", 11);
    }

    public Building(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Building 생성 : " + name);
    }
}
