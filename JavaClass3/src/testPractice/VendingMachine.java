package testPractice;

public class VendingMachine {
    private String name;
    private int price;
    private int stock;

    public VendingMachine(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void sell(int sellStock) {
        if (sellStock > 0 && sellStock <= stock) {
            stock -= sellStock;
        } else {
            System.out.println("음료를 판매할 수 없습니다.");
        }
    }

    public void showInfo() {
        System.out.println("==판매 후==");
        System.out.println("음료 이름: " + name);
        System.out.println("가격: " + price + "원");
        System.out.println("남은 재고: " + stock + "개");
    }
}
