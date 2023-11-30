package chapter02.ch04;

public class Order {
    public int orderId;
    public String buyerId;
    public String sellerId;
    public int productId;
    public String orderDate;

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void getOrder() {
        System.out.println(orderId + " " + buyerId + " " + sellerId + " " + productId + " " + orderDate);
    }
}
