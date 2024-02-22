package Abstract;

public class SBIBankAccount extends RBIBankAccount {
    double person1=500;
    double person2=600;
    double person3=800;


    public SBIBankAccount(double sbiBalance, double hdfcBalance,double person1,double person2,double person3) {
        super(sbiBalance, hdfcBalance);
        this.person1=person1;
        this.person2=person2;
        this.person3=person3;
    }

    @Override
    public void sendAmount() {

        double totalSendAmt=person1+person2+person3;

        if(sbiBalance>=totalSendAmt){

        }
    }

}
