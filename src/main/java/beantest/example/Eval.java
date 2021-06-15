package beantest.example;

import org.springframework.stereotype.Component;

@Component
public class Eval {
    private String name;

    public Eval() {
        this.name = "eval";
        System.out.println("Eval 생성");
    }

    public String getName() {
        return name;
    }
}
