package polymorphism;

public class HDFCBankService extends RBIBankService {
    public double calculateInterest(int principalAmt){
        double interestAmt = super.calculateInterest(principalAmt);
        double totalAmt = interestAmt+principalAmt;
        return totalAmt;
    }
    public double calculateInterest(int principalAmt,int days){
        double totalAmt = 0;
        if(days >89){
            return this.calculateInterest(principalAmt);
        }
        return totalAmt+principalAmt;
    }
}
