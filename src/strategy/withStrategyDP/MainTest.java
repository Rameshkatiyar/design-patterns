package strategy.withStrategyDP;

public class MainTest {
    public static void main(String[] args) {
        Thar thar = new Thar();
        thar.drive();

        Xuv700 xuv700 = new Xuv700();
        xuv700.drive();

        Tesla tesla = new Tesla();
        tesla.drive();;
    }
}
