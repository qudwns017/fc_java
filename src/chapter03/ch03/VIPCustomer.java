package chapter03.ch03;

public class VIPCustomer extends Customer {

    String agentID;
    private double saleRatio;

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "VIP";
        saleRatio = 0.1;
        bonusRatio = 0.05;
        System.out.println("VIPCustomer(int, String) called");
    }

//    public VIPCustomer() {
//        super(1, "abc");
//
//        customerGrade = "VIP";
//        saleRatio = 0.1;
//        bonusRatio = 0.05;
//
//    }



    public String getAgentID() {
        return agentID;
    }
}
