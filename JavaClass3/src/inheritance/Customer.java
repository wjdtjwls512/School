package inheritance;

public class Customer {
    protected int customerID;       // 고객 아이디
    protected String customerName;  // 고객 이름
    protected String customerGrade; // 고객 등금
    int bonusPoint;               // 보너스 포인트
    double bonusRatio;            // 보너스 포인트 적립비율

    public Customer() {
        this.customerGrade = "SILVER";
        this.bonusRatio = 0.01;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }
}
