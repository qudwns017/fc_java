package chapter03.ch06;

public class VIPCustomer extends Customer {

    String agentID;
    private double saleRatio;

//    public VIPCustomer() {
//        super(1, "abc");
//
//        customerGrade = "VIP";
//        saleRatio = 0.1;
//        bonusRatio = 0.05;
//
//    }

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "VIP";
        saleRatio = 0.1;
        bonusRatio = 0.05;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price * saleRatio);
        return price;
    }

    public String getAgentID() {
        return agentID;
    }
}
