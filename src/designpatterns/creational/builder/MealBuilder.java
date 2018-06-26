package designpatterns.creational.builder;

public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegDosa());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new MasalaDosa());
        meal.addItem(new Pepsi());
        return meal;
    }
}
