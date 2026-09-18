package reference;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1001, "김도현");
        Student studentPark = new Student(1002, "박병일");

        studentLee.setKoreanSubject("국어", 100);
        studentLee.setMathSubject("수학", 99);
        studentPark.setKoreanSubject("국어", 82);
        studentPark.setMathSubject("수학", 100);

        studentLee.showStudentInfo();
        studentPark.showStudentInfo();
    }
}
