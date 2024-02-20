package rateofinterest;

public class RBIBankRate {
    double rateOfInterest = 0;
    double emi = 0;
   public double calculateEMI(double loanAmt,int loanTenure){
       for ( double i = 0; i <loanTenure -1;i++) {
           rateOfInterest = getRateOfInterest();
           emi = loanAmt * rateOfInterest * loanTenure / (loanTenure - 1);
           System.out.println(emi);
       }
       return emi;
   }

    public double getRateOfInterest() {
       return 0.02;
    }

}
