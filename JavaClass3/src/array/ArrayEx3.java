package array;

public class ArrayEx3 {
    public static void main(String[] args) {
        int arr[] = new int[5];

        for (int i = 1, j = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                arr[j++] = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
