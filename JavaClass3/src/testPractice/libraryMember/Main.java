package testPractice.libraryMember;

import java.util.Scanner;

/*
 * [도서관 회원 번호 발급]
 * 회원 번호는 1001부터 시작하며 회원이 생성될 때마다 1씩 증가한다.
 * LibraryMember는 회원 번호와 이름, 1000으로 시작하는 정적 serialNum을 관리하고
 * 회원 정보 출력과 현재까지 등록된 전체 회원 수 반환 메서드를 제공한다.
 * Main은 이름 세 개를 입력받아 회원을 만들고 각각의 정보와 전체 수를 출력한다.
 */
// 회원 이름과 개별 회원 번호를 보관하고, 정적 변수로 발급 수를 관리한다.
class LibraryMember {
    // 회원마다 다른 발급 번호를 저장한다.
    private int memberId;
    // 계좌 예금주, 회원, 관람객 등 이 객체와 연결된 이름을 저장한다.
    private String name;
    // 객체가 생성될 때마다 증가시켜 다음 번호를 발급하는 공용 값이다.
    private static int serialNum = 1000;

    // 생성자: 회원 이름을 저장하고 serialNum을 증가시켜 새 회원 번호를 발급한다.
    public LibraryMember(String name) {
        this.name = name;
        serialNum++;
        this.memberId = serialNum;
    }

    // 객체가 가진 정보를 사용자가 읽을 수 있도록 출력한다.
    public void showInfo() {
        System.out.println("회원 번호: " + memberId + ", 이름: " + name);
    }

    // 초기 번호 1000을 뺀 값으로 지금까지 발급한 회원 수를 반환한다.
    public static int getMemberCount() { return serialNum - 1000; }
}

// 입력값을 받고 객체의 메서드를 호출해 문제의 흐름을 진행한다.
public class Main {
    // 프로그램이 시작되는 지점이다. 입력, 객체 생성, 메서드 호출 순으로 진행한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryMember[] members = new LibraryMember[3];
        // 정해진 횟수만큼 반복하거나 배열/목록의 각 항목을 차례대로 처리한다.
        for (int i = 0; i < members.length; i++) members[i] = new LibraryMember(sc.nextLine());

        System.out.println("==도서관 회원 목록==");
        // 정해진 횟수만큼 반복하거나 배열/목록의 각 항목을 차례대로 처리한다.
        for (LibraryMember member : members) member.showInfo();
        System.out.println("전체 회원 수: " + LibraryMember.getMemberCount() + "명");
    }
}
