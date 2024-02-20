package polymorphism;

public class SBIBankService extends RBIBankService {
    public double calculateInterest(int principalAmt){
        double interestAmt = super.calculateInterest(principalAmt);
        double totalAmt = interestAmt+principalAmt;
        return totalAmt;
    }
    public double calculateInterest(int principalAmt,int days){
        double totalAmt = 0;
        if(days >85){
            return this.calculateInterest(principalAmt);
        }
        return totalAmt;
    }
}
