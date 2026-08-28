package loop;

public class WhileEx1 {
    public static void main(String[] args) {
        int i = 1;
        int total = 0;

        while (i <= 10) {
            total += i;
            i++;
        }
        System.out.println("1부터 10까지의 합은 "+total+"입니다.");
    }
}
