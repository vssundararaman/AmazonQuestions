package fundamental.enumpack;

import com.sun.xml.internal.ws.resources.HttpserverMessages;

public class DirectionDriver {


    public static void printDirection(Direction direction)
    {
        direction.showDirection();
    }

    public static <T extends Enum<T> & Direction>   void printDirections(Class<T> clazz){

        for(Direction direction: clazz.getEnumConstants()){
            direction.showDirection();
        }
    }

    public static void main(String[] args) {

        DirectionDriver.printDirection(BasicDirection.EAST);
        DirectionDriver.printDirection(AdvanceDirection.SOUTHWEST);

        DirectionDriver.printDirections(BasicDirection.class);
        DirectionDriver.printDirections(AdvanceDirection.class);

    }
}
