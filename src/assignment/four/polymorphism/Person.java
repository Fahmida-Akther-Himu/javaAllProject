package assignment.four.polymorphism;

public class Person {
    public String height, weight;

    public void eat() {
        System.out.println("People eat food every day.");
    }

    public void sleep() {
        System.out.println("Everyone should get at least 6 hours of sleep per day.");
    }

    public void read() {
        System.out.println("Every person should receive an education.");
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.eat();
        person.sleep();
        person.read();
    }

}
