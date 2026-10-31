package testPractice.bankTransfer;

import java.util.Scanner;

/*
 * [은행 계좌 이체]
 * 세 계좌 중 이체 대상을 선택하고 금액을 입력받아 이체한 뒤 모든 계좌를 출력한다.
 * 계좌번호, 예금주, 잔액은 private이며 입금, 출금, 이체, 정보 출력 메서드를 제공한다.
 * 이순신 계좌에서 김용식(1) 또는 안중근(2) 계좌로 이체한다. 잔액이 부족하면 안내하고,
 * 잘못된 번호이면 오류를 출력한다.
 */
// 계좌의 소유자와 잔액을 보관하고 입금·출금·이체 기능을 제공한다.
class BankAccount {
    // 계좌를 구별하는 계좌 번호를 저장한다.
    private String accountNumber;
    // 계좌 예금주, 회원, 관람객 등 이 객체와 연결된 이름을 저장한다.
    private String name;
    // 계좌에 남아 있는 금액을 저장한다.
    private int balance;

    // 생성자: 계좌 번호·예금주·초기 잔액을 받아 계좌를 준비한다.
    public BankAccount(String accountNumber, String name, int balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    // 입력받은 금액만큼 계좌 잔액을 늘린다.
    public void deposit(int money) { balance += money; }
    // 입력받은 금액만큼 계좌 잔액을 줄인다. 이체에서는 잔액 확인 후 호출한다.
    public void withdraw(int money) { balance -= money; }

    // 잔액이 충분한지 확인한 뒤 출금과 대상 계좌 입금을 차례로 처리한다.
    public void transfer(BankAccount target, int money) {
        // 먼저 조건을 확인해 허용되는 경우와 처리할 수 없는 경우를 나눈다.
        if (balance >= money) {
            withdraw(money);
            target.deposit(money);
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    // 객체가 가진 정보를 사용자가 읽을 수 있도록 출력한다.
    public void showInfo() {
        System.out.println(name + "의 계좌번호: " + accountNumber + " 잔액: " + balance + "원");
    }
}

// 입력값을 받고 객체의 메서드를 호출해 문제의 흐름을 진행한다.
public class Main {
    // 프로그램이 시작되는 지점이다. 입력, 객체 생성, 메서드 호출 순으로 진행한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount accountLee = new BankAccount("101-1234-5678", "이순신", 100000);
        BankAccount accountKim = new BankAccount("101-5678-1234", "김용식", 200000);
        BankAccount accountAhn = new BankAccount("101-7485-9632", "안중근", 300000);

        System.out.println("이체할 대상과 금액을 입력하세요. (김용식: 1, 안중근: 2)");
        int number = sc.nextInt();
        int money = sc.nextInt();
        // 먼저 조건을 확인해 허용되는 경우와 처리할 수 없는 경우를 나눈다.
        if (number == 1) {
            accountLee.transfer(accountKim, money);
        } else if (number == 2) {
            accountLee.transfer(accountAhn, money);
        } else {
            System.out.println("잘못된 번호를 입력하셨습니다.");
        }

        accountLee.showInfo();
        accountKim.showInfo();
        accountAhn.showInfo();
    }
}
