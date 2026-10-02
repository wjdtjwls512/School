package thisdemo;

public class ReturnItSelf {
    public static void main(String[] args) {
        Student student = new Student();

//        student.setId(1301);
//        student.setName("이정연");
//        student.setGrade(1);

//        Student student1 = student.setId(1301);
//        Student student2 = student1.setName("이정연");
//        Student student3 = student2.setGrade(1);

        student.setId(1301).setName("이정연").setGrade(1).showStudentInfo();
    }
}
