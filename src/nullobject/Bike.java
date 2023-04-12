package nullobject;

public class Bike implements Vehicle{
    @Override
    public void showVehicleType() {
        System.out.println("Two Wheeler.");
    }

    @Override
    public void getMileage() {
        System.out.println(30);
    }
}
