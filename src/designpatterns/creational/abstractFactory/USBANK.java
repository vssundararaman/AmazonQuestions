package designpatterns.creational.abstractFactory;

public class USBANK  implements Bank{

    private final String name;

    public USBANK(){
        this.name="USBANK";
    }

    @Override
    public String getName() {
        return name;
    }
}
