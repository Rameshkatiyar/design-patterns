package singleton;

public class SingletonClass {
    private static SingletonClass singletonClass = new SingletonClass();

    private SingletonClass() {
    }

    public void print() {
        System.out.println("This is a singleton class.");
    }

    public static SingletonClass getInstance() {
        return singletonClass;
    }
}
