package interfacelatestdemo;

public class HDFCLoginService implements BankLoginService{
    String accountNumber="2222";
    String password="1234";
    @Override
    public boolean login(String userName, String password) {
        if(userName.equals(accountNumber) && this.password.equals(password)){
            return true;
        }
        return false;
    }
}
