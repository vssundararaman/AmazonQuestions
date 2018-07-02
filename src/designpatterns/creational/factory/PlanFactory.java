package designpatterns.creational.factory;

public class PlanFactory {

    public Plan getPlan(String planType){
        if(planType == null){
            return null;
        }

        if(planType.equalsIgnoreCase("DomesticPlan")){
            return new DomesticPlan();
        }

        if(planType.equalsIgnoreCase("CommercialPlan")){
            return new CommercialPlan();
        }

        return null;
    }
}
