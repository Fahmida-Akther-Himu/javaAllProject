package assignment.four.polymorphism;

public class Woman extends Person {
    @Override
    public void eat() {
        System.out.println("Females consume less food than males.");
    }

    @Override
    public void sleep() {
        int dailyTime = 3;
        System.out.println("Every woman sleeps " + dailyTime + " times a day.");
    }

    public static void main(String[] args) {
        Woman woman = new Woman();
        woman.eat();
        woman.sleep();
        woman.read();
    }
}
