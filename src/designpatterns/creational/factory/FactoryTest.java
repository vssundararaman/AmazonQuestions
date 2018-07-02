package designpatterns.creational.factory;

public class FactoryTest {

    public static void main(String[] args) {

        PlanFactory planFactory = new PlanFactory();

        String planName = "CommercialPlan";
        double units = 152;

        Plan plan = planFactory.getPlan(planName);

        System.out.print("Bill Amount for " + planName + " Of " + units + " units is : " );

        plan.getRate();

        plan.calculateBill(units);

    }
}
