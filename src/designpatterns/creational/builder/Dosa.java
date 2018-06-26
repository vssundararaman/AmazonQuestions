package designpatterns.creational.builder;

public abstract class Dosa implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
