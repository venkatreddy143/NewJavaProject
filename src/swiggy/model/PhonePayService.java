package swiggy.model;

import swiggy.SwiggyPaymentService;

import java.util.Date;
import java.util.UUID;

public class PhonePayService implements SwiggyPaymentService {

    @Override
    public PaymentResponse payment(PaymentRequest request) {
        PaymentRequest paymentInitationRequest= new PaymentRequest("Swiggy"+ UUID.randomUUID().toString(),
                request.getAmt(),request.getTxnDate(),"5555",false);
        SBIBankService sbiBankService=new SBIBankService();
        return sbiBankService.transfer(paymentInitationRequest);

    }
}
