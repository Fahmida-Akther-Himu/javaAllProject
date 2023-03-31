package assignment.four.polymorphism;

public class Child extends Woman {
    @Override
    public void eat() {
        System.out.println("Children should consume an adequate amount of vitamin-rich foods.");
    }

    @Override
    public void sleep() {
        System.out.println("Every child should get at least 8 hours of sleep per night.");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.eat();
        child.sleep();
    }
}
