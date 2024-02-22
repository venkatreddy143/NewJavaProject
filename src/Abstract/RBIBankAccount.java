package Abstract;

public abstract class RBIBankAccount {
    protected double sbiBalance;
    protected double hdfcBalance;


    public RBIBankAccount(double sbiBalance,double hdfcBalance) {
        this.sbiBalance = sbiBalance;
        this.hdfcBalance=hdfcBalance;
    }
    public abstract void sendAmount();

    public double getBalance() {
        return getBalance();
    }

}

