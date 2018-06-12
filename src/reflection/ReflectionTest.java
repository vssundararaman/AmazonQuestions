package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {

    public static void main(String[] args) throws Exception {

        //Creating Object
        Test test = new Test();

        Class cls = test.getClass();
        System.out.println("The Name of the Class " + cls.getName());

        //Getting Constuctor
        Constructor constructor = cls.getConstructor();
        System.out.println("The Constructor name is "+ constructor.getName());

        System.out.println("The public method in the Test Class are :");

        Method[] methods =cls.getMethods();

        //Printing Method Names
        for(Method method: methods){
            System.out.println(method.getName());
        }

        //Method Invoking
        Method methodCall = cls.getDeclaredMethod("method2",int.class);


        methodCall.invoke(test,12);

        //Field Accessing
        Field field = cls.getDeclaredField("s");
        field.setAccessible(true);

        field.set(test," Java");

        Method methodCall2 = cls.getDeclaredMethod("method1");
        methodCall2.invoke(test);

        Method methodCall3 = cls.getDeclaredMethod("method3");

        methodCall3.setAccessible(true);

        methodCall3.invoke(test);
    }
}
