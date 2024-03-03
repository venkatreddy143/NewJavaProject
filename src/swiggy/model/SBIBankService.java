package swiggy.model;

import java.util.Date;
import java.util.UUID;

public class SBIBankService {
    private String accountNumber = "1234";
    private double amt = 5000;
    private String merchantAccountNumber = "1234";
    private double merchantAmt = 1000;


    public PaymentResponse transfer(PaymentRequest request) {
        System.out.println(request.getTxId());
        if (request.isMerchantDebit()) {
            merchantAmt = merchantAmt - request.getAmt();
            amt = amt + request.getAmt();
        } else {
            amt = amt - request.getAmt();
            merchantAmt = merchantAmt + request.getAmt();
        }

        PaymentResponse response = new PaymentResponse(UUID.randomUUID().toString(),"Success",new Date());
        return response;
    }
}
