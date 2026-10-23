package streamOthers;

import inputStream.SystemInTest;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름: ");
        String name = sc.nextLine();

        System.out.println("직업: ");
        String job = sc.nextLine();

        System.out.println("사번: ");
        int no = sc.nextInt();
        sc.nextLine();

        System.out.println("전화번호: ");
        String tel = sc.nextLine();

        System.out.println("이름: " + name + "\n직업: " + job + "\n사번: " + no + "\n전화번호: " + tel);
    }
}
