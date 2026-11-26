package test2;

import java.util.ArrayList;

public class JobMatch {
    Boss bestBoss = null;
    ArrayList<Boss> bosses;
    Customer me;
    int maxScore = -1;

    public JobMatch(Customer customer, ArrayList<Boss> bosses) {
        this.me = customer;
        this.bosses = bosses;
    }

    public void showTheBestBoss()
    {
        for(Boss b : bosses)
        {
            if(me.getSkill() >= b.getWantedSkill() || me.getSkill()+1 == b.getWantedSkill())
            {
                int salaryScore = (int) (double)((b.getSalary() / me.wantedSalary)*100);
                int benefitScore = (int) (double)((b.getGiveBenefits() / me.getBenefits())*100);

                int totalScore = salaryScore + benefitScore;

                if(totalScore >= maxScore)
                {
                    maxScore = totalScore;
                    bestBoss = b;
                }
            }
        }

        bestBoss.showTheBestBoss();
        System.out.println("최종 점수: "+ maxScore+"점 입니다");
    }


}