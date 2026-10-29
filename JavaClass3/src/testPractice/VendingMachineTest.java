package testPractice;

import java.util.Scanner;

public class VendingMachineTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        VendingMachine vendingMachine = new VendingMachine("콜라", 1500, 10);

        int sellStock = sc.nextInt();

        vendingMachine.sell(sellStock);

        vendingMachine.showInfo();
    }
}
