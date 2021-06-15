package hello.example;

public class Apple {
    private String name;
    private String state;

    public Apple(String name, String state) {
        this.name = name;
        this.state = state;
        System.out.println("Apple 생성 : " + name);
    }
}
