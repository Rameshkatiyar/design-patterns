package nullobject;

/**
 * Default null object.
 */
public class NullVehicle implements Vehicle{
    @Override
    public void showVehicleType() {
        System.out.println("Not found any type.");
    }

    @Override
    public void getMileage() {
        System.out.println(0);
    }
}
