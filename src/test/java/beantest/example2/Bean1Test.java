package beantest.example2;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class Bean1Test {
    @Test
    void name() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Bean1.class);
        Object bean1 = context.getBean("bean1");
    }
}