package assignment.five.abstraction;

public class PickUpTruck extends Truck {

    @Override
    String color() {
        return "Blue";
    }

    @Override
    double getCost() {
        return 8500;
    }

    public double getTotalPrice(int amount) {
        return (getCost() * amount);
    }
}
