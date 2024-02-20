package rateofinterest;

public class SBIBankRate extends RBIBankRate{
    public double calculateEMI(double loanAmt,int loanTenure){
        double rateOfInterest =getRateOfInterest();
        double emi= loanAmt*rateOfInterest*loanTenure/(loanTenure-1);
        return emi;
    }
    public double getRateOfInterest() {
        return 0.024;
    }
}
