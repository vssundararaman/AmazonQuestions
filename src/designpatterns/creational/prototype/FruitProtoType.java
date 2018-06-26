package designpatterns.creational.prototype;

public class FruitProtoType {

    public static void main(String[] args) throws CloneNotSupportedException {
        FruitStore.getFruit("Apple").addFruit();
        FruitStore.getFruit("Mango").addFruit();
        FruitStore.getFruit("Mango").addFruit();
        FruitStore.getFruit("Apple").addFruit();
    }
}
