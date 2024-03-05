package interfacelatestdemo;

public class InvalidRunTimeOTPException extends Exception {
    private String code;

    public InvalidRunTimeOTPException(String errorCode, String message) {
        super(message);
        this.code = errorCode;
    }
}
