package designpatterns.creational.singleton;

public class Singleton {

    private static Singleton singleton = null;

    public String name;

    private Singleton(){
        name = "This is Singleton Class";
    }

    public static Singleton singleton(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
