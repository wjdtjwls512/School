package loop;

public class WhileEx2 {
    public static void main(String[] args) {
        int i = 1;
        int total = 0;

        do {
            total += i;
            i++;
        } while (i <= 10);
        System.out.println("1부터 10까지의 합은 "+total+"입니다.");
    }
}
