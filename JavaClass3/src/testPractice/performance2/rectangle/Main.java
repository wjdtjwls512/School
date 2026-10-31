package testPractice.performance2.rectangle;

import java.util.Scanner;

/*
 * [직사각형 넓이와 둘레 계산]
 * 가로와 세로를 입력받아 직사각형 정보를 출력한다.
 * Rectangle의 가로와 세로는 private으로 선언하고, 생성자로 초기화한다.
 * getArea()는 넓이, getRerimeter()는 둘레를 반환하며 showInfo()는 정보를 출력한다.
 */
// 직사각형의 가로·세로를 보관하고 넓이와 둘레를 계산한다.
class Rectangle {
    // 직사각형의 가로 길이를 저장한다.
    private int width;
    // 직사각형의 세로 길이를 저장한다.
    private int height;

    // 생성자: 가로와 세로를 저장해 이후 넓이와 둘레를 계산할 수 있게 한다.
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // 가로와 세로를 곱한 직사각형 넓이를 반환한다.
    public int getArea() {
        return width * height;
    }

    // 문제지에 적힌 메서드 이름(getRerimeter)을 그대로 사용했다.
    // 가로 두 개와 세로 두 개의 합인 직사각형 둘레를 반환한다.
    public int getRerimeter() {
        return (width + height) * 2;
    }

    // 객체가 가진 정보를 사용자가 읽을 수 있도록 출력한다.
    public void showInfo() {
        System.out.println("가로: " + width);
        System.out.println("세로: " + height);
        System.out.println("넓이: " + getArea());
        System.out.println("둘레: " + getRerimeter());
    }
}

// 입력값을 받고 객체의 메서드를 호출해 문제의 흐름을 진행한다.
public class Main {
    // 프로그램이 시작되는 지점이다. 입력, 객체 생성, 메서드 호출 순으로 진행한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();

        Rectangle rectangle = new Rectangle(width, height);
        rectangle.showInfo();
    }
}
