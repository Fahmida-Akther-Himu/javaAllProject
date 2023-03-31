package assignment.five.abstraction;

public abstract class Truck {
    abstract String color();

    abstract double getCost();

    Truck() {
        System.out.println("Trucks run the road at night.");
    }

    public void changeBattery() {
        System.out.println("The truck battery needs to be changed.");
    }
}