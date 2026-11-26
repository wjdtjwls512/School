package test2;

public class ItBoss extends Boss{
    String category;
    public ItBoss(String bossName, int wantedSkill, int salary , int giveBenefits , String category)
    {
        super(bossName , wantedSkill , salary , giveBenefits);
        this.category = category;
    }

    @Override
    public void showTheBestBoss()
    {
        System.out.println("회사 이름: " + bossName);
        System.out.println("회사에서 요구하는 수준: " + wantedSkill);
        System.out.println("회사에서 주는 연봉: " + salary);
        System.out.println("회사 복지: " + giveBenefits);
        System.out.println("회사의 직무 유형: " + category);
    }

}