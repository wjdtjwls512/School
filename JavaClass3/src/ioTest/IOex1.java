package ioTest;

import java.util.Scanner;

public class IOex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int[] data = new int[10];

        for (int i = 0; i < data.length; i++) {
            data[i] = sc.nextInt();
            total += data[i];
        }

        double avg = (double)total / 10;

        System.out.println("합: " + total + " 평균: " + avg);
    }
}
