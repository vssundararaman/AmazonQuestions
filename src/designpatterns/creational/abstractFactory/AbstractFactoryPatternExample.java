package designpatterns.creational.abstractFactory;

public class AbstractFactoryPatternExample {

    public static void main(String[] args) {

        System.out.print("Enter the name of Bank from where you want to take loan amount: ");
        String bankName = "BOA";

        System.out.print("\n");
        System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");

        String loanName="Home";
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b=bankFactory.getBank(bankName);

        System.out.print("\n");
        System.out.print("Enter the interest rate for "+b.getName()+ ": ");

        double rate=12D;
        System.out.print("\n");
        System.out.print("Enter the loan amount you want to take: ");

        double loanAmount=1200D;
        System.out.print("\n");
        System.out.print("Enter the number of years to pay your entire loan amount: ");
        int years=10;

        System.out.print("\n");
        System.out.println("you are taking the loan from "+ b.getName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan l=loanFactory.getLoan(loanName);
        l.getInterestRate(rate);
        l.calculateLoan(loanAmount,years);
    }
}

