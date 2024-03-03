package interfacelatestdemo;

public class SBIBankLoginProcess implements BankLoginService{

    SBIBankLoginService sbiBankLoginService;
    public SBIBankLoginProcess(){
        sbiBankLoginService=new SBIBankLoginService();
    }
    @Override
    public boolean login(String userName, String password) {
        if(sbiBankLoginService.login(userName, password)){
            String otp=sbiBankLoginService.generateOTP(userName);
            boolean validOtp=sbiBankLoginService.validateOTP(otp);
            if(validOtp){
                System.out.println("Valid Otp & Login Is Successful");
            }else{
                System.out.println("Invalid Otp & Login Is Failed");
            }
            return validOtp;
        }else {
            System.out.println("Invalid Credentials");
            return false;
        }
    }
}
