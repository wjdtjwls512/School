package test01;

public class TestEx15 {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num--;
            }
            System.out.println();
        }
    }
}
