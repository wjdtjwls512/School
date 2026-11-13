package polymorphism.Customer;

public class VIPCustomer extends Customer {
    private int agentID;
    double saleRatio;

    public VIPCustomer() {
        initVIPCustomer();
    }

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        initVIPCustomer();
        this.agentID = agentID;
    }

    private void initVIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public int getAgentID() {
        return agentID;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }

    public String showCustomerInfo() {
        return super.showCustomerInfo() + "\n상담원 아이디는 " + getAgentID() + "입니다.";
    }
}