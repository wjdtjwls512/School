package polymorphism.Customer;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CustomerTest2 {
    public static void main(String[] args) {
        Customer[] customerList = new Customer[5];

        customerList[0] = new VIPCustomer(1, "일번", 1);
        customerList[1] = new GOLDCustomer(2, "이번");
        customerList[2] = new GOLDCustomer(3, "삼번");
        customerList[3] = new Customer(4, "사번");
        customerList[4] = new Customer(5, "오번");

        System.out.println("===고객정보 출력===");
        for (int i = 0; i < customerList.length; i++) {
            System.out.println(customerList[i].showCustomerInfo());
        }

        System.out.println("\n===할인율과 보너스포인트 계산===");
        int price = 10000;

        for (int i = 0; i < customerList.length; i++) {
            int cost = customerList[i].calcPrice(price);
            System.out.println(customerList[i].customerName + "님이 지불해야 할 금액은 " + cost + "입니다.");
            System.out.println(customerList[i].showCustomerInfo());
        }
    }
}
