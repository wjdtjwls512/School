package test2_1314_1315;

public class Customer {
    static int seral = 0;
    String name;
    int salary;
    int skill;
    int benefit;

    public static void setSeral(int seral) {
        Customer.seral = seral;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public void setBenefit(int benefit) {
        this.benefit = benefit;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getSkill() {
        return skill;
    }

    public int getBenefit() {
        return benefit;
    }

    public void showTheBestWorker()
    {
        System.out.println("이름: " + name);
        System.out.println("요구 연봉: " + salary);
        System.out.println("보유 역량: " + skill);
        System.out.println("요구 복지: " + benefit);
    }
}