package interfacelatestdemo;

public interface BankLoginService {
     boolean login(String userName,String password) throws InvalidRunTimeOTPException;
}
