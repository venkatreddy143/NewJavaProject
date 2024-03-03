package swiggy;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public List<OrderItem>orderItemList=new ArrayList<>();

    private double price;
    private double serviceCharge;
    private int tipAmount;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Order() {
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public int getTipAmount() {
        return tipAmount;
    }

    public void setTipAmount(int tipAmount) {
        this.tipAmount = tipAmount;
    }

    public Order(double price, double serviceCharge, int tipAmount) {
        this.price = price;
        this.serviceCharge = serviceCharge;
        this.tipAmount = tipAmount;
    }

    public void addItem(OrderItem item){
        orderItemList.add(item);
        price=price+ item.getPrice();

    }

    @Override
    public String toString() {
        return "Order{" +
                "orderItemList=" + orderItemList +
                ", price=" + price +
                ", serviceCharge=" + serviceCharge +
                ", tipAmount=" + tipAmount +
                ", status='" + status + '\'' +
                '}';
    }

    public void removeItem(OrderItem item){
        orderItemList.remove(item);
        price=price- item.getPrice();
    }

}
