package strategy.withStrategyDP;

public class Vehicle {
    private DriveType driveType;

    public Vehicle(DriveType driveType) {
        this.driveType = driveType;
    }

    public void drive() {
        this.driveType.drive();
    }
}
