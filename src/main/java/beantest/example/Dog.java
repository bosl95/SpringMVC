package beantest.example;

public class Dog {
    private String name;
    private int age;

    public Dog() {
        this("골든 리트리버", 3);
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Dog 생성 : " + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
