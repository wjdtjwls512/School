package cooperation;

public class Student {
    private String studentName;
    private int grade;
    private int money;

    public Student(String name, int money) {
        this.money = money;
        this.studentName = name;
    }

    public void takeBus(Bus bus) {
        // 버스가 승객을 태우는 메소드
        bus.takePerson();
        money -= 1100;
    }

    public void takeSubway(Subway subway) {
        // 지하철이 승객을 태우는 메소드
        subway.takePerson();
        money -= 850;
    }

    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은 " + money + "원입니다.");
    }
}
