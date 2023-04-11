package strategy.withStrategyDP;

public class Tesla extends Vehicle {
    public Tesla() {
        super(new AutoPilot());
    }
}
