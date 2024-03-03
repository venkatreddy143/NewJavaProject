package swiggy.model;
import swiggy.*;
public class TestSwiggy{
      public static void main(String[] args) {
        Product chickenBiryani = new Product("Chicken Biryani", 500);
        Product chicken65 = new Product("Chicken 65", 250);
        OrderItem biryaniItem = new OrderItem(chickenBiryani, 2,500);
        OrderItem chicken65Item = new OrderItem(chicken65, 1,250);
        Order order = new Order();
        order.addItem(biryaniItem);
        order.addItem(chicken65Item);
        SwiggyOrderProcess swiggyOrderProcess = new SwiggyOrderProcess(new PhonePayService()) {
            @Override
            public boolean delivery(Order order) {
                return false;
            }
        };
        Order processedOrder = swiggyOrderProcess.createOrder(order);
        System.out.println("Processed Order Details:");
        System.out.println("Status: " + processedOrder.getStatus());
        System.out.println("Price: " + processedOrder.getPrice());
        System.out.println("Service Charge: " + processedOrder.getServiceCharge());
        System.out.println("Tip Amount: " + processedOrder.getTipAmount());
        System.out.println("Items:");
        for (OrderItem item : processedOrder.getOrderItemList()) {
            System.out.println("  - " + item.getProduct().getType() + " | Quantity: " + item.getQuantity() + " | Price: " + item.getPrice());
        }
    }
}