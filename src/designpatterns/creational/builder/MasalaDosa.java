package designpatterns.creational.builder;

public class MasalaDosa extends Dosa{
    @Override
    public String name() {
        return "Masala Dosa";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
