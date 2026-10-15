package staticdemo;

public class StudentTest {
    public static void main(String[] args) {
        Student studentPark = new Student();
        Student studentShin = new Student();

        studentPark.setStudentName("박준민");
        studentShin.setStudentName("신지호");

        System.out.println(studentPark.getStudentId() + studentPark.getStudentName());
        System.out.println(studentShin.getStudentId() + studentShin.getStudentName());
        System.out.println(studentPark.getStudentId() + studentPark.getStudentName());
        System.out.println(studentPark.serialNum);
        System.out.println(Student.serialNum);

    }
}
