package interfacelatestdemo;

import java.util.UUID;

public class SBIBankLoginProcess implements BankLoginService{

    SBIBankLoginService sbiBankLoginService;
    public SBIBankLoginProcess(){
        sbiBankLoginService=new SBIBankLoginService();
    }
    @Override
    public boolean login(String userName, String password) throws InvalidRunTimeOTPException {
        if(sbiBankLoginService.login(userName, password)){
            String otp=sbiBankLoginService.generateOTP(userName);
            boolean validOtp= false;
            try {
                validOtp = sbiBankLoginService.validateOTP(UUID.randomUUID().toString());
            } catch (InvalidOTPException exp) {
                System.out.println("Error Occurred"+exp);
                throw new InvalidRunTimeOTPException(exp.getCode(),exp.getMessage());
            }
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
