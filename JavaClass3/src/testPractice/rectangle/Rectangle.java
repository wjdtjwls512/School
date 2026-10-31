package testPractice.rectangle;

// 직사각형의 가로·세로를 보관하고 넓이와 둘레를 계산한다.
public class Rectangle {
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

    // 가로 두 개와 세로 두 개의 합인 직사각형 둘레를 반환한다.
    public int getRerimeter() {
        return  width * 2 + height * 2;
    }

    // 객체가 가진 정보를 사용자가 읽을 수 있도록 출력한다.
    public void showInfo() {
        System.out.println("가로: " + width);
        System.out.println("세로: " + height);
        System.out.println("넓이: " + getArea());
        System.out.println("둘레: " + getRerimeter());
    }
}
