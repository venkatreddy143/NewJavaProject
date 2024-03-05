package exception;

import javax.swing.*;
import java.security.KeyStore;

public class CustomExceptionService {
    public String checkException(){
        try {
            throw new Exception("throwing check exception") ;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("from checkpoint method finally block");
        }
    }
    public String checkException2() throws Exception {
        throw new Exception("throwing check exception");
    }
    public String unCheckException(){
        throw new RuntimeException("throwing uncheck exception");
    }
}
