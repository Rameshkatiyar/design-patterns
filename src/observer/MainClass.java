package observer;

public class MainClass {
    public static void main(String args[]){
        System.out.println("First Time");
        Subject subject = new Subject();
        subject.updateStatus("1.0");

        ClientOne clientOne = new ClientOne();
        ClientTwo clientTwo = new ClientTwo();

        System.out.println("Second Time");
        subject.subscribe(clientOne);
        subject.updateStatus("2.0");

        System.out.println("Third Time");
        subject.subscribe(clientTwo);
        subject.updateStatus("3.0");

        System.out.println("Fourth Time");
        subject.unSubscribe(clientOne);
        subject.updateStatus("4.0");
    }
}
