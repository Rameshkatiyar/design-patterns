package nullobject;

public class MainTest {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.getVehicle("car");
        vehicle.showVehicleType();

        //Null handled.
        Vehicle nullVehicle = vehicleFactory.getVehicle("bicycle");
        nullVehicle.showVehicleType();
    }
}
