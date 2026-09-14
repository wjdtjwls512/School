package practice;

public class test06 {
    public static void main(String[] args) {
        int total = 0;
        int[] numbers = {12, 7, 18, 57, 24, 39, 16, 8};
        System.out.print("홀수 번째 요소: ");
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                total += i;
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println("\n홀수 번째 요소의 합: " + total);
    }
}
