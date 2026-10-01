package encapsultion;

public class PhoneStoreTest {
    public static void main(String[] args) {
        Phone phone = new Phone("아이폰", 3000000);
        PhoneStore store = new PhoneStore(phone);
        Customer customer = new Customer("조현미", "아이폰", 2000000);
        customer.buyPhone(store);
    }
}