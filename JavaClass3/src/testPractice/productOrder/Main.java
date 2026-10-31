package testPractice.productOrder;

import java.util.Scanner;

/*
 * [상품 주문]
 * 마우스 상품의 재고와 가격을 관리하고 주문자 이름과 수량으로 주문을 처리한다.
 * Product는 상품 번호, 이름, 가격, 재고를 private으로 갖고 가격/이름/재고 조회,
 * 재고 감소, 상품 정보 출력 메서드를 제공한다. Order는 주문 번호를 1000부터 증가시키며,
 * 주문 금액 계산과 재고 확인 후 주문 처리 및 결과 출력을 담당한다.
 */
// 상품 정보와 현재 재고를 보관하며 주문에 필요한 조회·재고 변경 기능을 제공한다.
class Product {
    // 상품을 구별하는 번호를 저장한다.
    private int pNO;
    // 상품 이름을 저장한다.
    private String pName;
    // 상품 또는 음료의 가격을 저장한다.
    private int price;
    // 판매할 수 있는 현재 재고 수량을 저장한다.
    private int stock;

    // 생성자: 상품 번호·상품명·가격·초기 재고를 받아 상품을 준비한다.
    public Product(int pNO, String pName, int price, int stock) {
        this.pNO = pNO;
        this.pName = pName;
        this.price = price;
        this.stock = stock;
    }

    // 상품 가격을 반환해 주문 금액 계산에 사용할 수 있게 한다.
    public int getPrice() { return price; }
    // 상품 이름을 반환한다.
    public String getName() { return pName; }
    // 현재 재고 수량을 반환한다.
    public int getStock() { return stock; }
    // 주문이 성공했을 때 주문 수량만큼 재고를 줄인다.
    public void reduceStock(int num) { stock -= num; }

    public void showInfor() {
        System.out.println("상품 번호: " + pNO);
        System.out.println("상품명: " + pName);
        System.out.println("상품 가격(원): " + price);
        System.out.println("재고 수량: " + stock);
    }
}

// 주문자, 주문 상품, 수량과 주문 번호를 보관하고 주문을 처리한다.
class Order {
    // 주문한 사람의 이름을 저장한다.
    private String oName;
    // 주문이 만들어질 때마다 증가하는 공용 주문 번호다.
    public static int oNO = 1000;
    // 이번 주문에서 판매할 Product 객체를 참조한다.
    private Product product;
    // 차량 관리 번호 또는 주문 수량을 저장한다.
    private int num;

    // 생성자: 주문자·상품·수량을 저장하고 새 주문 번호를 발급한다.
    public Order(String oName, Product product, int num) {
        this.oName = oName;
        oNO++;
        this.product = product;
        this.num = num;
    }

    // 상품 한 개 가격에 주문 수량을 곱해 주문 금액을 반환한다.
    public int getTotalPrice() { return product.getPrice() * num; }

    // 재고가 충분하면 재고를 줄이고 주문 결과를 출력하며, 부족하면 안내한다.
    public void processOrder() {
        // 먼저 조건을 확인해 허용되는 경우와 처리할 수 없는 경우를 나눈다.
        if (product.getStock() >= num) {
            product.reduceStock(num);
            showInfo();
        } else {
            System.out.println("재고가 부족합니다.");
        }
    }

    // 객체가 가진 정보를 사용자가 읽을 수 있도록 출력한다.
    public void showInfo() {
        System.out.println("주문자 이름: " + oName);
        System.out.println("주문 번호: " + oNO);
        System.out.println("주문 상품명: " + product.getName());
        System.out.println("주문 수량: " + num);
        System.out.println("주문 금액: " + getTotalPrice() + "원");
    }
}

// 입력값을 받고 객체의 메서드를 호출해 문제의 흐름을 진행한다.
public class Main {
    // 프로그램이 시작되는 지점이다. 입력, 객체 생성, 메서드 호출 순으로 진행한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product mouse = new Product(101, "마우스", 5000, 100);
        String name = sc.nextLine();
        int num = sc.nextInt();
        Order order = new Order(name, mouse, num);

        System.out.println("==주문 결과==");
        order.processOrder();
        System.out.println("\n==주문 후 상품 정보==");
        mouse.showInfor();
    }
}
