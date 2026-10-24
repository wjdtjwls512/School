package ioTest;

import java.util.Scanner;

public class IOex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] data = new char[10];

        for (int i = 0; i < data.length; i++) {
            data[i] = sc.next().charAt(0);
        }

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }
    }
}
