package reference;

public class Student {
    int studentId;
    String studentName;
    Subject korean = new Subject();
    Subject math = new Subject();

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void setKoreanSubject(String subjectName, int score) {
        korean.setSubjectName(subjectName);
        korean.setScorePoint(score);
    }
}
