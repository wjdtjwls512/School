package polymorphism.Customer;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10011, "이순신");
        System.out.println(customerLee.showCustomerInfo());

        System.out.println();
        Customer customerKim = new VIPCustomer(20011, "김유신", 2001);
        System.out.println(customerKim.showCustomerInfo());

        System.out.println("====할인율과 포인트 계산====");
        int price = 40000;

        int priceLee = customerLee.calcPrice(price);
        int priceKim = customerKim.calcPrice(price);

        System.out.println(customerLee.customerName + "님이 지불해야 할 금액은 " + priceLee + "원입니다.");
        System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerKim.customerName + "님이 지불해야 할 금액은 " + priceKim + "원입니다.");
        System.out.println(customerKim.showCustomerInfo());
    }
}