package thisdemo.builder;

public class Student {
    private int id;
    private String name;
    private int grade;
    private String major;
    private String phoneNumber;

    private Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.grade = builder.grade;
        this.major = builder.major;
        this.phoneNumber = builder.phoneNumber;
    }

    public void showInfo() {
        System.out.println("학번: " + id);
        System.out.println("이름: " + name);
        System.out.println("학년: " + grade);
        System.out.println("전공: " + major);
        System.out.println("전화번호: " + phoneNumber);
    }

    public static class Builder {
        private int id;
        private String name;
        private int grade;
        private String major;
        private String phoneNumber;

        public Builder(int id, String name, int grade) {
            this.id = id;
            this.name = name;
            this.grade = grade;
        }

        public Builder major(String major) {
            this.major = major;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    public static void main(String[] args) {
        Student student = new Builder(1301, "이정연", 1).major("풀스택").phoneNumber("010-1234-5678").build();
        student.showInfo();
    }
}
