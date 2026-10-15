package cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student studentKim = new Student("김도현", 60000);
        Student studentLee = new Student("이하랑", 10000);

        Bus busA = new Bus(937);

        Subway subway2 = new Subway(2);

        studentKim.takeBus(busA);
        studentLee.takeSubway(subway2);

        studentKim.showInfo();
        studentLee.showInfo();

        studentKim.takeSubway(subway2);
        studentKim.showInfo();
    }
}
