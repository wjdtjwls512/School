package loop;

public class forEx1 {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 1; i <= 10; i++) {
            total += i;
        }
        System.out.println("1부터 10까지의 합은 "+total+"입니다.");
    }
}
