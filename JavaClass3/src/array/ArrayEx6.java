package array;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[][] score = new int[][]{
                {89, 76, 100, 68, 48, 98, 56, 77, 95},
                {50, 60, 70, 100, 99, 88, 83, 78, 93}
        };

        int totalA = 0;
        int totalB = 0;

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                if (i == 0) {
                    totalA += score[i][j];
                } else if (i == 1) {
                    totalB += score[i][j];
                }
                }
            }

        double avgA = (double) totalA / score[0].length;
        double avgB = (double) totalB / score[1].length;

        System.out.printf("A반 평균: %.1f\n", avgA);
        System.out.printf("B반 평균: %.1f\n", avgB);
    }
}