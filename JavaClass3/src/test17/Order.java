package test17;

public class Order {
    long orderId;
    String customerId;
    String orderDate;
    String customerName;
    String productId;
    String address;

    public void showInfo() {
        System.out.println("주문번호: " + orderId);
        System.out.println("주문자 아이디: " + customerId);
        System.out.println("주문 날짜: " + orderDate);
        System.out.println("주문자 이름: " + customerName);
        System.out.println("주문 상품 번호: " + productId);
        System.out.println("배송 주소: " + address);
    }
}
