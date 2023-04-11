package strategy.withStrategyDP;

public class ManualDrive implements DriveType{
    @Override
    public void drive() {
        System.out.println("Manual driving vehicle...!");
    }
}
