package hello.example;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ConfigTest {
    @Test
    void name() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Company company = context.getBean("company", Company.class);
//        System.out.println("company = " + company.getAddress().getStreet());
    }
}