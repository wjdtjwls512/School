package testPractice;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle(sc.nextInt(), sc.nextInt());

        rectangle.showInfo();
    }
}
