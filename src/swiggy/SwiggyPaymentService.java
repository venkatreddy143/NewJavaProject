package swiggy;

import swiggy.model.PaymentRequest;
import swiggy.model.PaymentResponse;

public interface SwiggyPaymentService {
    PaymentResponse payment(PaymentRequest request);

}
