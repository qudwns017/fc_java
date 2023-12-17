package chapter03.ch02;

public class VIPCustomer extends Customer {

    String agentID;
    private double saleRatio;

    public VIPCustomer() {
        customerGrade = "VIP";
        saleRatio = 0.1;
        bonusRatio = 0.05;
    }

    public String getAgentID() {
        return agentID;
    }
}
