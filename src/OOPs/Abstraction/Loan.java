package OOPs.Abstraction;

abstract class Loan {
    String LoanAmount;

    public  Loan(String LoanAmount){
        this.LoanAmount = LoanAmount;
    }
    abstract double calculateLoan();
}

class PersonalLoan extends Loan{
    double Amount;
    public PersonalLoan(String LoanAmount, double Amount){
        super(LoanAmount);
        this.Amount = Amount;
    }
    @Override
    double calculateLoan(){
        System.out.println("Your Personal Loan is Sanctioned");
        return Amount;
    }
}

class HomeLoan extends Loan{
    double Amount;
    public HomeLoan(String LoanAmount, double Amount){
        super(LoanAmount);
        this.Amount = Amount;
    }
    @Override
    double calculateLoan(){
        System.out.println("Your Home Loan is Sanctioned");
        return Amount;
    }
}

class VehicleLoan extends Loan{
    double Amount;
    public VehicleLoan(String LoanAmount, double Amount){
        super(LoanAmount);
        this.Amount = Amount;
    }
    @Override
    double calculateLoan(){
        System.out.println("Your Vehicle Loan is Sanctioned");
        return Amount;
    }
}