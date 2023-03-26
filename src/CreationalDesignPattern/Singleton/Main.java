package CreationalDesignPattern.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleObj1 = Singleton.getInstance();
        singleObj1.sayHello();

        Singleton singleObj2 = Singleton.getInstance();
        singleObj2.sayHello();

    }
}
