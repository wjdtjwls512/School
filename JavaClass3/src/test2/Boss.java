package test2;

public class Boss {
    static int seralId = 0;
    int BossId;
    String bossName;
    int wantedSkill;
    int salary;
    int giveBenefits;

    public Boss(String bossName, int wantedSkill, int salary , int giveBenefits)
    {
        this.BossId = seralId++;
        this.bossName = bossName;
        this.wantedSkill = wantedSkill;
        this.salary = salary;
        this.giveBenefits = giveBenefits;
    }

    public static int getSeralId() {
        return seralId;
    }

    public int getBossId() {
        return BossId;
    }

    public String getBossName() {
        return bossName;
    }

    public int getWantedSkill() {
        return wantedSkill;

    }

    public int getSalary() {
        return salary;
    }

    public int getGiveBenefits() {
        return giveBenefits;
    }

    public void showTheBestBoss()
    {
        System.out.println("회사 이름: " + bossName);
        System.out.println("회사에서 요구하는 수준: " + wantedSkill);
        System.out.println("회사에서 주는 연봉: " + salary);
        System.out.println("회사 복지: " + giveBenefits);
    }
}