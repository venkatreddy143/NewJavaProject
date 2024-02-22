package Abstract;

public class HDFCBankAccount extends RBIBankAccount {

    int person1 =400;
    int person2 =500;
    int person3 =600;
    int hdfcTotalSendAmt = person1 + person2 + person3;


    public HDFCBankAccount(int sbiBalance, int hdfcBalance, int person1, int person2, int person3) {
        super(sbiBalance, hdfcBalance);
        this.person1 = person1;
        this.person2 = person2;
        this.person3 = person3;
    }

    @Override
    public String toString() {
        return "HDFCBankAccount{" +
                "person1=" + person1 +
                ", person2=" + person2 +
                ", person3=" + person3 +
                ", hdfcTotalSendAmt=" + hdfcTotalSendAmt +
                ", sbiBalance=" + sbiBalance +
                ", hdfcBalance=" + hdfcBalance +
                '}';
    }

    @Override
    public void sendAmount() {

        if (sbiBalance >= hdfcTotalSendAmt) {

            System.out.println(hdfcTotalSendAmt);
        } else {
            System.out.println("Not Transfered");
        }

    }
}
