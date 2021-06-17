package beantest.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.BDDMockito.given;

@SpringBootTest(classes = Config2.class)
public class MockBeanTest {
    @MockBean
    private Apple apple;

    @Test
    void test() {
        // given
        System.out.println("apple : " + apple.getName());

        // when
        // apple.getName()을 하면 "풋사과"를 리턴하도록 한다.
        given(apple.getName()).willReturn("풋사과");

        // then
        System.out.println("apple : " + apple.getName());
    }
}
