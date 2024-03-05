package interfacelatestdemo;

public class InvalidOTPException  extends Exception{

    private String code;

    public String getCode() {
        return code;
    }

    public InvalidOTPException(String errorCode, String message){
        super(message);
        this.code=errorCode;

    }

}
