package chapter4;

public class Person {
    private String name = "xiaobai";
    private int age = 20;

    public Person (String name,int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName () {
        return this.getName();
    }
}
