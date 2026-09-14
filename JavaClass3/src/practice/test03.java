package practice;

public class test03 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 7; i <= 55; i += 3) {
            total += i;
        }
        System.out.println("7부터 55까지 3씩 증가하는 수의 합: " + total);
    }
}
