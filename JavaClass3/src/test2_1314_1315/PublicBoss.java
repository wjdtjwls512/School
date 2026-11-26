package test2_1314_1315;

public class PublicBoss extends Boss{
    private String category;

    public PublicBoss(String bossName, int wantedSkill, int salary , int giveBenefits, String category) {
        super(bossName, wantedSkill,salary, giveBenefits);
        this.category = category;
    }

    @Override
    public void showTheBestBoss() {
        System.out.println("대표 이름: " + bossName);
        System.out.println("요구 스킬 수준: " + wantedSkill);
        System.out.println("지급 연봉: " + salary);
        System.out.println("회사 복지 수준: " + giveBenefits);
        System.out.println("회사 분야: " + category);
    }
}