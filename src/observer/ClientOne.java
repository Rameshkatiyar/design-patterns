package observer;

public class ClientOne extends Observer {
    @Override
    public void update(String status) {
        System.out.println("One: "+status);
    }
}
