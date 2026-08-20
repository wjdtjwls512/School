package operater;

public class OperationEx2 {
    public static void main(String[] args) {
        int gameScore = 150;

        int lastScore = ++gameScore;
        System.out.println(lastScore); // 151
        System.out.println(gameScore); // 151

        int lastScore2 = gameScore++;
        System.out.println(lastScore2); // 151
        System.out.println(gameScore); // 152

        int lastScore3 = --gameScore;
        System.out.println(lastScore3); // 151
        System.out.println(gameScore); // 151

        int lastScore4 = gameScore--;
        System.out.println(lastScore4); // 151
        System.out.println(gameScore); // 150
    }
}
