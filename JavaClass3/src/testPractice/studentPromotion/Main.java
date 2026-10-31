package testPractice.studentPromotion;

import java.util.Scanner;

/*
 * [학생 정보 변경]
 * 학생의 진급할 학년과 전공을 입력하고, 진급 후 정보를 출력한다.
 * Student 클래스는 학번, 이름, 학년, 전공을 private 멤버 변수로 갖고,
 * 생성자와 setMajor(), setGrade(), showInfo() 메서드를 제공한다.
 * Main에서는 진급 학년과 전공을 입력받아 변경 후 학생 정보를 출력한다.
 */
// 학생의 기본 정보와 진급 후 변경되는 학년·전공을 관리한다.
class Student {
    // 학생의 학번을 저장한다.
    private int sId;
    // 학생의 이름을 저장한다.
    private String sName;
    // 학생의 현재 학년을 저장한다.
    private int grade;
    // 학생의 전공을 저장한다.
    private String major;

    // 생성자: 학번·이름·초기 학년·초기 전공을 받아 학생 객체를 준비한다.
    public Student(int sId, String sName, int grade, String major) {
        this.sId = sId;
        this.sName = sName;
        this.grade = grade;
        this.major = major;
    }

    // 학생의 전공을 입력값으로 바꾼다.
    public void setMajor(String major) { this.major = major; }
    // 학생의 학년을 입력값으로 바꾼다.
    public void setGrade(int grade) { this.grade = grade; }

    // 객체가 가진 정보를 사용자가 읽을 수 있도록 출력한다.
    public void showInfo() {
        System.out.println("학번: " + sId);
        System.out.println("이름: " + sName);
        System.out.println("학년: " + grade);
        System.out.println("전공: " + major);
    }
}

// 입력값을 받고 객체의 메서드를 호출해 문제의 흐름을 진행한다.
public class Main {
    // 프로그램이 시작되는 지점이다. 입력, 객체 생성, 메서드 호출 순으로 진행한다.
    public static void main(String[] args) {
        Student student = new Student(1101, "김철수", 1, "공통과");
        Scanner input = new Scanner(System.in);

        int grade = input.nextInt();
        input.nextLine();
        String major = input.nextLine();

        student.setGrade(grade);
        student.setMajor(major);
        System.out.println("==진급 후==");
        student.showInfo();
    }
}
