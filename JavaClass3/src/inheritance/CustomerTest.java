package inheritance;

public class CustomerTest {
    public static void main(String[] args) {
//        Customer customerLee = new Customer();
//        customerLee.customerID = 10010;
//        customerLee.customerName = "이정연";
//        customerLee.bonusPoint = 1000;
//
//        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerMoon = new VIPCustomer();
        customerMoon.customerID = 20010;
        customerMoon.customerName = "문성준";
        customerMoon.bonusPoint = 10000;

        System.out.println(customerMoon.showCustomerInfo());

        VIPCustomer customerHa = new VIPCustomer(20010, "하강호", 1101);
        customerHa.bonusPoint = 20000;

//        System.out.println(customerHa.showCustomerInfo());
        System.out.println(customerHa.showVIPInfo());
    }

}
