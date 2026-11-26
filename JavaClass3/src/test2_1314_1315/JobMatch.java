package test2_1314_1315;

import java.util.ArrayList;

public class JobMatch {
    int maxscore = -1;
    int score;
    Boss bestBoss;
    ArrayList<Boss> bosss;
    Customer me;

    public void setBosss(ArrayList<Boss> bosss) {
        this.bosss = bosss;
    }

    public void setMe(Customer me) {
        this.me = me;
    }

    JobMatch(){}

    public void whoBestBoss()
    {
        for(Boss b : bosss)
        {
            if(b.getWantedSkill() >= me.getSkill())
            {
                score = 0;
                score += (int)(double) ((b.getGiveBenefits() / me.getBenefit())*100);
                score += (int)(double) ((b.getSalary() / me.getSalary())*100);

                if(maxscore < score)
                {
                    maxscore = score;
                    bestBoss = b;
                }
            }
        }

        System.out.println("최고의 회사정보");
        bestBoss.showTheBestBoss();
    }
}