package testPractice.vendingMachine;

// 음료 이름·가격·재고를 관리하고 재고 범위 안에서 판매한다.
public class VendingMachine {
    // 계좌 예금주, 회원, 관람객 등 이 객체와 연결된 이름을 저장한다.
    private String name;
    // 상품 또는 음료의 가격을 저장한다.
    private int price;
    // 판매할 수 있는 현재 재고 수량을 저장한다.
    private int stock;

    // 생성자: 음료 이름·가격·초기 재고를 받아 자판기 상품을 준비한다.
    public VendingMachine(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // 구매 수량이 양수이고 재고 이하일 때만 재고를 차감한다.
    public void sell(int sellStock) {
        // 먼저 조건을 확인해 허용되는 경우와 처리할 수 없는 경우를 나눈다.
        if (sellStock > 0 && sellStock <= stock) {
            stock -= sellStock;
        } else {
            System.out.println("음료를 판매할 수 없습니다.");
        }
    }

    // 객체가 가진 정보를 사용자가 읽을 수 있도록 출력한다.
    public void showInfo() {
        System.out.println("==판매 후==");
        System.out.println("음료 이름: " + name);
        System.out.println("가격: " + price + "원");
        System.out.println("남은 재고: " + stock + "개");
    }
}
