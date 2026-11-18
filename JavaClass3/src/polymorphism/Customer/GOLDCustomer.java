package polymorphism.Customer;

public class GOLDCustomer extends Customer{
    double saleRatio;

    public GOLDCustomer() {
        initGOLDCustomer();
    }
    public GOLDCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        initGOLDCustomer();
    }

    private void initGOLDCustomer() {
        customerGrade = "GOLD";
        bonusRatio = 0.02;
        saleRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }

    public String showCustomerInfo() {
        return super.showCustomerInfo();
    }
}
