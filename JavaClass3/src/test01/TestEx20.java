package test01;

public class TestEx20 {
    public static void main(String[] args) {
        int[][] seats = {
                {1, 0, 0, 1, 0},
                {0, 1, 1, 0, 0},
                {1, 1, 0, 0, 1},
                {0, 0, 0, 1, 0},
        };

        int count = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == 1) {
                    count += 1;
                }
            }
        }
        System.out.printf("예매 가능한 좌석의 수는 %d입니다.", count);
    }
}
