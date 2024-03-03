package swiggy;

import swiggy.model.PaymentRequest;
import swiggy.model.PaymentResponse;
import swiggy.model.SBIBankService;

import java.util.Date;
import java.util.UUID;

public abstract class SwiggyOrderProcess {

        SwiggyPaymentService swiggyPaymentService;
        public SwiggyOrderProcess(SwiggyPaymentService swiggyPaymentService){
            this.swiggyPaymentService=swiggyPaymentService;
        }



    public Order getFinalOrder(Order order){
        double tax=0;
        if(order.getPrice()>1000){
            tax=order.getPrice()*20/100;
        }
        double finalAmt = order.getPrice()+tax+20;
        Order finalOrder = new Order(finalAmt,tax,20);
        finalOrder.setOrderItemList(order.getOrderItemList());
        return finalOrder;
    }
    public Order createOrder(Order order){
        Order finalOrder= getFinalOrder(order);
        PaymentRequest paymentInitationRequest= new PaymentRequest("Swiggy"+ UUID.randomUUID().toString(),
                        finalOrder.getPrice(),new Date(), "5555", false);
        PaymentResponse response=swiggyPaymentService.payment(paymentInitationRequest);
        if(response != null){
            finalOrder.setStatus("Success");
            System.out.println(response.getCoRelationId());
        }
        delivery(finalOrder);
 

        return finalOrder;
    }
    public abstract boolean delivery(Order order);

    @Override
    public String toString() {
        return "SwiggyOrderProcess{" +
                "swiggyPaymentService=" + swiggyPaymentService +
                '}';
    }
}
