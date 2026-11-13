package inheritance;

public class CustomerTest2 {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10011, "이순신");
        VIPCustomer customerKim = new VIPCustomer(20011, "김좌진", 2011);

        int price = customerLee.calcPrice(40000);
        System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerLee.customerName + "님이 지불해야 할 금액은 " + price + "원입니다");

        int priceVIP = customerKim.calcPrice(40000);
        System.out.println(customerKim.showCustomerInfo());
        System.out.println(customerKim.customerName + "님이 지불해야 할 금액은 " + priceVIP + "원입니다");
    }
}
