package operater;

public class OperationAssignment1 {
    public static void main(String[] args) {
       double val1 = 2.5, val2 = 3.5, val3 = 6.5;
       double sum =  val1 + val2 + val3;
       double avg = sum / 3;

        System.out.printf("합계: "+"%.1f", sum);
        System.out.println();
        System.out.printf("평균: "+"%.1f", avg);
    }
}
