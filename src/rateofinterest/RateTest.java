package rateofinterest;

public class RateTest {
    public static void main(String[] args) {
        SBIBankRate sbiBankRate=new SBIBankRate();
        AxisBankRate axisBankRate=new AxisBankRate();
        RBIBankRate rbiBankRate=new RBIBankRate();

        double loanAmt=500000;
        int loanTenure=12;
        System.out.println("SBI EMI:"+sbiBankRate.calculateEMI(loanAmt,loanTenure));
        System.out.println("Axis EMI:"+axisBankRate.calculateEMI(loanAmt,loanTenure));
        System.out.println(rbiBankRate.calculateEMI(loanAmt,loanTenure));
    }
}
