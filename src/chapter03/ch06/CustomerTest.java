package chapter03.ch06;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();

        Customer customerQ = new Customer(10010, "Qomas");
        Customer customerW = new Customer(10020, "Womas");
        Customer customerE = new GoldCustomer(10030, "Eomas");
        Customer customerR = new GoldCustomer(10040, "Romas");
        Customer customerT = new VIPCustomer(10050, "Tomas");

        customerList.add(customerQ);
        customerList.add(customerW);
        customerList.add(customerE);
        customerList.add(customerR);
        customerList.add(customerT);

        int price = 10000;

        for (Customer customer : customerList) {
            int cost = customer.calcPrice(price);

            System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
            System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "입니다.");
        }

        for (Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }

        VIPCustomer vc = (VIPCustomer) customerE;
    }
}
