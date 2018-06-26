package designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class FruitStore {

    private static Map<String, Fruit> fruitMap = new HashMap<String, Fruit>();

    static{
        fruitMap.put("Mango", new Mango());
        fruitMap.put("Apple", new Apple());
    }

    public static Fruit getFruit(String fruitName) throws CloneNotSupportedException {
        return (Fruit) fruitMap.get(fruitName).clone();
    }
}
