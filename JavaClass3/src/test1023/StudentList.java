package test1023;

import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        String[] name = {"강하늘", "김도영", "박영현", "안세영", "우상혁", "최인호"};

        int i = 1101;

        ArrayList<Student> studentList = new ArrayList<Student>();

        for (String studentName : name) {
            studentList.add(new Student(i++, studentName));
        }

        for (Student student : studentList) {
            student.showStudentInfo();
        }
    }
}
