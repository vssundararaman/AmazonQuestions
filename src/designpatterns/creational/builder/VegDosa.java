package designpatterns.creational.builder;

public class VegDosa extends Dosa{

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Dosa";
    }
}
