package Abstract;

public abstract class RBIBankAccount {
    protected int sbiBalance;
    protected int hdfcBalance;


    public RBIBankAccount(int sbiBalance,int hdfcBalance) {
        this.sbiBalance = sbiBalance;
        this.hdfcBalance=hdfcBalance;
    }
    public abstract void sendAmount();

    public double getBalance() {
        return getBalance();
    }

}

