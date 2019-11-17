package observer;

public class ClientTwo extends Observer {
    @Override
    public void update(String status) {
        System.out.println("Two: "+status);
    }
}
