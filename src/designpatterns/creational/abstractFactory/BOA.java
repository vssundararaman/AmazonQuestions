package designpatterns.creational.abstractFactory;

public class BOA implements Bank {

    private final String name;

    public BOA(){
        this.name = "Bank of America";
    }
    @Override
    public String getName() {
        return name;
    }
}
