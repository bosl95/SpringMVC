package beantest.example2;

import org.springframework.stereotype.Component;

@Component
public class Bean2 {
    public Bean2() {
        func();
    }

    public void func() {
        System.out.println("Bean2 생성");
    }
}
