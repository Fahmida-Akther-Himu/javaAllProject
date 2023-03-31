package assignment.five.abstraction;

public class VehicleTest {

    public static void main(String[] args) {

        Vehicle bus = new BigBus();
        bus.run();
        System.out.println("Big bus toll collection rate will be : " + bus.tollCollectionRate() + " BDT.");
        Vehicle car = new Car();
        car.run();
        System.out.println("Car toll collection rate will be : " + car.tollCollectionRate() + " BDT.");
        System.out.println();

        PickUpTruck pickUpTruck = new PickUpTruck();
        pickUpTruck.changeBattery();
        System.out.println("Get the total cost for the pickup truck : " + pickUpTruck.getTotalPrice(11) + " BDT.");
        System.out.println("Pickup color will be " + pickUpTruck.color());
        System.out.println(pickUpTruck.getCost());
    }

}
