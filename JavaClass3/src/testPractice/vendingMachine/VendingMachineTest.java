package testPractice.vendingMachine;

import java.util.Scanner;

// 구매 수량을 입력받아 음료를 판매하고 결과를 출력한다.
public class VendingMachineTest {
    // 프로그램이 시작되는 지점이다. 입력, 객체 생성, 메서드 호출 순으로 진행한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        VendingMachine vendingMachine = new VendingMachine("콜라", 1500, 10);

        int sellStock = sc.nextInt();

        vendingMachine.sell(sellStock);

        vendingMachine.showInfo();
    }
}
