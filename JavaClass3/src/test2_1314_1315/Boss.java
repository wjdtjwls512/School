package test2_1314_1315;

public class Boss {
    static int seralBoss = 0;
    int bossID;
    String bossName;
    int wantedSkill;
    int salary;
    int giveBenefits;

    public Boss(String bossName, int wantedSkill, int salary, int giveBenefits) {
        seralBoss++;
        bossID = seralBoss;
        this.bossName = bossName;
        this.wantedSkill = wantedSkill;
        this.salary = salary;
        this.giveBenefits = giveBenefits;
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

    public void showTheBestBoss() {
        System.out.println("회사 이름: " + bossName);
        System.out.println("요구 스킬 수준: " + wantedSkill);
        System.out.println("지급 연봉: " + salary);
        System.out.println("회사 복지 수준: " + giveBenefits);
    }
}