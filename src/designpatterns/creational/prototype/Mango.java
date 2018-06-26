package designpatterns.creational.prototype;

public class Mango extends Fruit{

    public Mango(){
        this.fruitName = "Mango";
    }

    @Override
    void addFruit() {
        System.out.println("Mango Added");
    }
}
