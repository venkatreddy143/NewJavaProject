package polymorphism;

public class BankServiceTest {
    public static void main(String[] args) {
        SBIBankService sbiBankService=new SBIBankService();
        double sbiBankInterest=sbiBankService.calculateInterest(1000,86);
        System.out.println("sbi bank"+"="+sbiBankInterest);
        HDFCBankService hdfcBankService=new HDFCBankService();
        double hdfcBankInterest=hdfcBankService.calculateInterest(1000,86);
        System.out.println("hdfc bank"+"="+hdfcBankInterest);


    }
}
