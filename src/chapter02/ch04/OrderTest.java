package chapter02.ch04;

public class OrderTest {
    public static void main(String[] args) {
    Order order_1 = new Order();

    order_1.setOrderId(1);
    order_1.buyerId = "buyer";
    order_1.sellerId = "seller";
    order_1.productId = 3;
    order_1.orderDate = "230123";

    order_1.getOrder();
    }
}
