package array;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[] arr = new int[]{89, 76, 100, 68, 48, 98, 56, 77, 95};
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        double avg = (double)total / arr.length;
        System.out.println("점수의 합: " + total);
        System.out.printf("점수의 평균: %.1f%n", avg);
    }
}
