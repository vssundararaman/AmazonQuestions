package designpatterns.creational.factory;

public abstract class Plan {

    protected double rate;

    abstract void getRate();

    public void calculateBill(double units){
        System.out.println(units*rate);
    }
}
