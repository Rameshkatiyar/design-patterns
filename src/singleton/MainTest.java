package singleton;

public class MainTest {
    public static void main(String[] args) {
        SingletonClass instance = SingletonClass.getInstance();
        System.out.println(instance);
        instance.print();

        //Try to create an object. It is giving error.
//        SingletonClass singletonClass = new SingletonClass();
    }
}
