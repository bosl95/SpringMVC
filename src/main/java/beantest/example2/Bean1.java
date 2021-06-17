package beantest.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackageClasses = Bean1.class)
public class Bean1 {
    @Autowired
    Bean2 bean2;

    public Bean1(Bean2 bean2) {
        this.bean2 = bean2;
    }

    public Bean2 getBean2() {
        return bean2;
    }
}
