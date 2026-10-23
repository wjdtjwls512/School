package test1023;

public class Student {
    private int number;
    private String name;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public void showStudentInfo() {
        System.out.println("학번: " + number + ", " + "이름: " + name);
    }
}
