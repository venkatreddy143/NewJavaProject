package EMIbank;

public abstract class Loan {
    protected double principal;
    protected double interestRate;
    protected int repaymentPeriod;

    public Loan(double principal, double interestRate, int repaymentPeriod) {
        this.principal = principal;
        this.interestRate = interestRate;
        this.repaymentPeriod = repaymentPeriod;
    }

    public abstract void calculateEMI();
}
