package lesson4.linkedListHomeWork.generic;

public class LinkGeneric {
    private String name;
    private int age;

    public LinkGeneric next;

    public LinkGeneric(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + this.name + ", age: " + this.age);
    }
}
