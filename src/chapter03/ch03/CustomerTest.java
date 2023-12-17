package chapter03.ch03;

public class CustomerTest {
    public static void main(String[] args) {
        Customer lee = new Customer(990, "이순신");
        lee.bonusPoint = 1000;
        System.out.println(lee.showCustomerInfo());

        VIPCustomer kim = new VIPCustomer(1000, "김유신");
        kim.bonusPoint = 10000;
        System.out.println(kim.showCustomerInfo());
    }
}
