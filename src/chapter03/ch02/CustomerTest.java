package chapter03.ch02;

public class CustomerTest {
    public static void main(String[] args) {
//        Customer lee = new Customer();
//        lee.setCustomerName("이순신");
//        lee.setCustomerID(1000);
//        lee.bonusPoint = 1000;
//        System.out.println(lee.showCustomerInfo());

        VIPCustomer kim = new VIPCustomer();
        kim.setCustomerName("김유신");
        kim.setCustomerID(1001);
        kim.bonusPoint = 10000;
        System.out.println(kim.showCustomerInfo());
    }
}
