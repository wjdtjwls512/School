package test17;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderId = 202609013;
        order.customerId = "dgsw";
        order.orderDate= "2026년 9월 1일";
        order.customerName = "홍길동";
        order.productId = "PD0345-12";
        order.address = "대구광역시 달성군 구지면 창리로 93";

        order.showInfo();
    }
}
