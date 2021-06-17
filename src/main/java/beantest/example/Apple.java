package beantest.example;

public class Apple {
    private String name;
    private String state;

    public Apple() {
    }

    public Apple(String name, String state) {
        this.name = name;
        this.state = state;
        System.out.println("Apple 생성 : " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
