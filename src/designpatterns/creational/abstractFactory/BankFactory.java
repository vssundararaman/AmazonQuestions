package designpatterns.creational.abstractFactory;

public class BankFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bank) {
        if(bank == null){
            return null;
        }
        if(bank.equalsIgnoreCase("BOA"))
        {
            return new BOA();
        }
        if(bank.equalsIgnoreCase("USBANK"))
        {
            return new USBANK();
        }
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
