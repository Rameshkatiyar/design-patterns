package nullobject;

public class Car implements Vehicle{
    @Override
    public void showVehicleType() {
        System.out.println("Four wheeler.");
    }

    @Override
    public void getMileage() {
        System.out.println(15);
    }
}
