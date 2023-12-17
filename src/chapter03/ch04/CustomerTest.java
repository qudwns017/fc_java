package chapter03.ch04;

public class CustomerTest {
    public static void main(String[] args) {
        Customer lee = new Customer(990, "이순신");
        lee.bonusPoint = 1000;

        int price = lee.calcPrice(1000);
        System.out.println(lee.showCustomerInfo() + price);

        VIPCustomer kim = new VIPCustomer(1000, "김유신");
        kim.bonusPoint = 10000;

        price = kim.calcPrice(1000);
        System.out.println(kim.showCustomerInfo() + price);

        Customer vc = new VIPCustomer(1234, "noName");

        System.out.println(vc.calcPrice(1000));
    }
}
