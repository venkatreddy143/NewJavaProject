package interfacedemo;

public class HDFCBankService implements RBIBankService{
    @Override
    public String transfer(String fromAccountNum, String toAccountNum, int amt) {
        return "Hdfc Bank Transfer Is Done";
    }
}
