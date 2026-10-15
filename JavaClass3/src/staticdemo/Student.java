package staticdemo;

import cooperation.Subway;

public class Student {
    public static int serialNum = 1300;

    private int studentId;
    private String studentName;
    private int grade;
    private String address;

    public Student() {
        serialNum++;
        this.studentId = serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public static int getSerialNum() {
        int i = 10;
        return serialNum;
    }
}
