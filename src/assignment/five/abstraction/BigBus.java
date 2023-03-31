package assignment.five.abstraction;

public class BigBus extends Vehicle {

    @Override
    double tollCollectionRate() {
        return 240;
    }

    @Override
    void run() {
        System.out.println("Bus is running slowly.");
    }

}
