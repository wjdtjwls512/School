package testPractice.rectangle;

import java.util.Scanner;

/*
 * [직사각형 넓이와 둘레 계산]
 * 가로와 세로를 입력받아 Rectangle 객체를 만들고 넓이와 둘레를 출력한다.
 * 넓이는 가로×세로, 둘레는 (가로+세로)×2로 계산한다.
 */
class Rectangle {
    private int width;   // 직사각형의 가로 길이
    private int height;  // 직사각형의 세로 길이

    // 입력받은 가로와 세로를 이 객체의 값으로 저장한다.
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // 직사각형 넓이 = 가로 × 세로
    public int getArea() {
        return width * height;
    }

    // 문제지에 적힌 메서드 이름을 그대로 사용했다. 직사각형 둘레 = (가로 + 세로) × 2
    public int getRerimeter() {
        return (width + height) * 2;
    }

    // 저장된 가로·세로와 계산한 넓이·둘레를 출력한다.
    public void showInfo() {
        System.out.println("가로: " + width);
        System.out.println("세로: " + height);
        System.out.println("넓이: " + getArea());
        System.out.println("둘레: " + getRerimeter());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자가 입력한 두 정수를 가로와 세로로 사용해 직사각형 객체를 만든다.
        int width = sc.nextInt();
        int height = sc.nextInt();
        Rectangle rectangle = new Rectangle(width, height);

        // 객체의 메서드에 출력 작업을 맡긴다.
        rectangle.showInfo();
    }
}
