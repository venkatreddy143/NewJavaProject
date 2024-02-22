package interfacedemo;

public class SbiBankService implements RBIBankService{
    @Override
    public String transfer(String fromAccountNum, String toAccountNum, int amt) {
        return "Sbi Transfer Is Done";
    }
}
