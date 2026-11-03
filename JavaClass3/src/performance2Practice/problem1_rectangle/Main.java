package performance2Practice.problem1_rectangle;

import java.util.Scanner;

// 문제 1: 직사각형 넓이와 둘레 계산
class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public int getRerimeter() {
        return (width + height) * 2;
    }

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
        int w = sc.nextInt();
        int h = sc.nextInt();

        Rectangle r = new Rectangle(w, h);
        r.showInfo();
    }
}
