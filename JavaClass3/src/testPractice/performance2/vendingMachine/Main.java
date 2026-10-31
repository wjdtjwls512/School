package testPractice.performance2.vendingMachine;

import java.util.Scanner;

/*
 * [자판기 음료 판매]
 * 콜라(1500원, 재고 10개)를 만들고 구매 수량을 입력받는다.
 * 수량이 0보다 크고 재고 이하일 때만 판매하고, 그 외에는 안내 문구를 출력한다.
 * 마지막에 음료 이름, 가격, 남은 재고를 출력한다.
 */
// 음료 이름·가격·재고를 관리하고 재고 범위 안에서 판매한다.
class VendingMachine {
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
    public void sell(int count) {
        // 먼저 조건을 확인해 허용되는 경우와 처리할 수 없는 경우를 나눈다.
        if (count > 0 && count <= stock) {
            stock -= count;
        } else {
            System.out.println("음료를 판매할 수 없습니다.");
        }
    }

    // 객체가 가진 정보를 사용자가 읽을 수 있도록 출력한다.
    public void showInfo() {
        System.out.println("음료 이름: " + name);
        System.out.println("가격: " + price + "원");
        System.out.println("남은 재고: " + stock + "개");
    }
}

// 입력값을 받고 객체의 메서드를 호출해 문제의 흐름을 진행한다.
public class Main {
    // 프로그램이 시작되는 지점이다. 입력, 객체 생성, 메서드 호출 순으로 진행한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VendingMachine machine = new VendingMachine("콜라", 1500, 10);

        int count = sc.nextInt();
        machine.sell(count);
        machine.showInfo();
    }
}
