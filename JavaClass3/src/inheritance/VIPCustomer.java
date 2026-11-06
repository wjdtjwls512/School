package inheritance;

public class VIPCustomer extends Customer {
    private int agentID;
    double saleRatio;

    public VIPCustomer() {
        super(); // 상위 클래스의 생성자를 호출하여 생성(컴파일러가 자동으로 추가)
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("하위 클래스 VIPCustomer() 생성자 호출");
    }

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.customerID = customerID;
        this.customerName = customerName;
        this.agentID = agentID;
        System.out.println("하위 클래스 VIPCustomer(int, String) 생성자 호출");
    }

    public int getAgentID() {
        return agentID;
    }

    public String showVIPInfo() {
        return super.showCustomerInfo()+ "\n상담원 아이디는 " + getAgentID() + "입니다.";
    }
}