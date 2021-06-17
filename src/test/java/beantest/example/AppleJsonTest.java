package beantest.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

@JsonTest
public class AppleJsonTest {
    @Autowired
    private JacksonTester<Apple> json;

    @Test
    void serialize() throws IOException {
        Apple apple = new Apple("풋사과", "달달함");

        assertThat(json.write(apple)).hasJsonPathStringValue("@.name");
        assertThat(json.write(apple))
                .extractingJsonPathStringValue("@.state")
                .isEqualTo("달달함");
    }

    @Test
    void deserialize() throws IOException {
        Apple apple = new Apple("풋사과", "달달함");
        String stringJson = "{\"name\": \"풋사과\", \"state\": \"달달함\"}";

        assertThat(json.parse(stringJson)).usingRecursiveComparison().isEqualTo(apple);
        assertThat(json.parseObject(stringJson).getName()).isEqualTo("풋사과");
    }
}
