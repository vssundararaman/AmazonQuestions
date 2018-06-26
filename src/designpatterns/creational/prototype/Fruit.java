package designpatterns.creational.prototype;

public abstract class Fruit implements Cloneable{

    protected String fruitName;

    abstract void addFruit();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
