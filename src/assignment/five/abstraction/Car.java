package assignment.five.abstraction;

public class Car extends Vehicle {

    @Override
    double tollCollectionRate() {
        return 70;
    }

    @Override
    void run() {
        System.out.println("Car is running fast.");
    }
}
