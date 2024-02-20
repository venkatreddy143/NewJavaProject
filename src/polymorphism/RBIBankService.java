package polymorphism;

public class RBIBankService {
    public double calculateInterest(int principalAmt){
        double duration = 0.25;
        double interest= principalAmt*duration*2.4/100;
        return interest;
    }

}
