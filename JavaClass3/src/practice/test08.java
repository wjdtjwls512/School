package practice;

public class test08 {
    public static void main(String[] args) {
        int num = 1;

        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(num++ + " ");
                }
            } else {
                int endNum = num + 4;
                for (int j = 0; j < 5; j++) {
                    System.out.print((endNum - j) + " ");
                }
                num += 5;
            }
            System.out.println();
        }
    }
}