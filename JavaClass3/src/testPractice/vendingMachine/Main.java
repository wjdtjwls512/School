package testPractice.vendingMachine;

import java.util.Scanner;

/*
 * [자판기 음료 판매]
 * 콜라 한 개의 가격은 1500원이고 처음 재고는 10개다.
 * 구매 수량을 입력받아 수량이 0보다 크고 재고 이하일 때만 판매한 뒤
 * 콜라 이름, 가격, 남은 재고를 출력한다.
 */
class VendingMachine {
    private String name;   // 음료 이름
    private int price;     // 음료 한 개의 가격
    private int stock;     // 현재 남아 있는 음료 수량

    // 음료 이름, 가격, 처음 재고를 받아 자판기 상품을 초기화한다.
    public VendingMachine(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // 양수이면서 현재 재고 이하인 수량만 판매할 수 있다.
    public void sell(int sellStock) {
        if (sellStock > 0 && sellStock <= stock) {
            stock -= sellStock; // 판매한 수만큼 재고에서 뺀다.
        } else {
            System.out.println("음료를 판매할 수 없습니다.");
        }
    }

    // 판매가 끝난 후 음료 정보와 남은 재고를 출력한다.
    public void showInfo() {
        System.out.println("==판매 후==");
        System.out.println("음료 이름: " + name);
        System.out.println("가격: " + price + "원");
        System.out.println("남은 재고: " + stock + "개");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문제 조건에 맞게 콜라 자판기를 준비한다.
        VendingMachine machine = new VendingMachine("콜라", 1500, 10);

        // 구매할 수량을 입력받아 판매 메서드에 전달한다.
        int sellStock = sc.nextInt();
        machine.sell(sellStock);

        // 판매 성공/실패 후의 자판기 정보를 확인한다.
        machine.showInfo();
    }
}
