package designpatterns.creational.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        Singleton singleton = Singleton.singleton();

        Singleton singleton1 = Singleton.singleton();

        Singleton singleton2 = Singleton.singleton();

        // changing variable of instance x
        singleton.name = (singleton.name).toUpperCase();

        System.out.println("String from singleton is " + singleton.name);
        System.out.println("String from singleton 1 is " + singleton1.name);
        System.out.println("String from singleton 2 is " + singleton2.name);

        System.out.println("\n");
    }
}
