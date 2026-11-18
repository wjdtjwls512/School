package polymorphism.Customer;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10011, "이순신");
        System.out.println(customerLee.showCustomerInfo());

        System.out.println();
        Customer customerKim = new VIPCustomer(20011, "김유신", 2001);
        System.out.println(customerKim.showCustomerInfo());
    }
}