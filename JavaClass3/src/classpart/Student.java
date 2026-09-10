package classpart;

public class Student {
    int student;
    String studentName;
    int grade;
    String address;

    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentName = "이순신";

        System.out.println(studentLee.studentName);
        System.out.println(studentLee.getStudentName());
    }
}