package testPractice.classScore;

import java.util.Scanner;

/*
 * [체육대회 반별 점수 관리]
 * 세 반의 줄다리기와 계주 점수를 입력받아 총점과 우승 반을 출력한다.
 * ClassScore는 반 이름과 두 점수를 private으로 갖고 총점/반 이름 조회 및 정보 출력 메서드를
 * 제공한다. 동점이면 먼저 입력된 반이 우승하도록 총점 비교에 >를 사용한다.
 */
// 한 반의 종목별 점수를 보관하고 총점을 계산한다.
class ClassScore {
    // 반을 구별할 이름을 저장한다.
    private String className;
    // 줄다리기에서 받은 점수를 저장한다.
    private int tugScore;
    // 계주에서 받은 점수를 저장한다.
    private int relayScore;

    // 생성자: 반 이름과 줄다리기·계주 점수를 받아 점수 객체를 준비한다.
    public ClassScore(String className, int tugScore, int relayScore) {
        this.className = className;
        this.tugScore = tugScore;
        this.relayScore = relayScore;
    }

    // 줄다리기 점수와 계주 점수를 더해 총점을 반환한다.
    public int getTotalScore() { return tugScore + relayScore; }
    // 반 이름을 반환해 우승 반을 표시할 때 사용한다.
    public String getClassName() { return className; }

    // 객체가 가진 정보를 사용자가 읽을 수 있도록 출력한다.
    public void showInfo() {
        System.out.println(className + ": " + getTotalScore() + "점");
    }
}

// 입력값을 받고 객체의 메서드를 호출해 문제의 흐름을 진행한다.
public class Main {
    // 프로그램이 시작되는 지점이다. 입력, 객체 생성, 메서드 호출 순으로 진행한다.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"1반", "2반", "3반"};
        ClassScore[] classes = new ClassScore[3];

        // 정해진 횟수만큼 반복하거나 배열/목록의 각 항목을 차례대로 처리한다.
        for (int i = 0; i < classes.length; i++) {
            int tug = input.nextInt();
            int relay = input.nextInt();
            classes[i] = new ClassScore(names[i], tug, relay);
        }

        System.out.println("==체육대회 결과==");
        // 정해진 횟수만큼 반복하거나 배열/목록의 각 항목을 차례대로 처리한다.
        for (ClassScore score : classes) score.showInfo();

        int maxIndex = 0;
        // 정해진 횟수만큼 반복하거나 배열/목록의 각 항목을 차례대로 처리한다.
        for (int i = 1; i < classes.length; i++) {
            // 먼저 조건을 확인해 허용되는 경우와 처리할 수 없는 경우를 나눈다.
            if (classes[i].getTotalScore() > classes[maxIndex].getTotalScore()) maxIndex = i;
        }
        System.out.println("우승 반: " + classes[maxIndex].getClassName() + " ("
                + classes[maxIndex].getTotalScore() + "점)");
    }
}
