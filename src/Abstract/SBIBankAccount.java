package Abstract;

public class SBIBankAccount extends RBIBankAccount {
    int person1 =600;
    int person2 =700;
    int person3 =800;

    int sbiTotalSendAmt = person1 + person2 + person3;


    public SBIBankAccount(int sbiBalance, int hdfcBalance, int person1, int person2, int person3) {
        super(sbiBalance, hdfcBalance);
        this.person1 = person1;
        this.person2 = person2;
        this.person3 = person3;
    }

    @Override
    public String toString() {
        return "SBIBankAccount{" +
                "person1=" + person1 +
                ", person2=" + person2 +
                ", person3=" + person3 +
                ", sbiTotalSendAmt=" + sbiTotalSendAmt +
                ", sbiBalance=" + sbiBalance +
                ", hdfcBalance=" + hdfcBalance +
                '}';
    }

    @Override
    public void sendAmount() {

        if (sbiBalance >= sbiTotalSendAmt) {

            System.out.println("Sbi sent Balance to Hdfc Bank:"+ "  "+sbiTotalSendAmt);
        } else {
            System.out.println("Not Transfered");
        }

    }
}
