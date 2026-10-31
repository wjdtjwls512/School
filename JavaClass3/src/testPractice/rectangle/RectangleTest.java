package testPractice.rectangle;

import java.util.Scanner;

// 가로와 세로를 입력받아 Rectangle 객체의 정보를 출력한다.
public class RectangleTest {
    // 프로그램이 시작되는 지점이다. 입력, 객체 생성, 메서드 호출 순으로 진행한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle(sc.nextInt(), sc.nextInt());

        rectangle.showInfo();
    }
}
