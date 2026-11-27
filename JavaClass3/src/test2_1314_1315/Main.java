package test2_1314_1315;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        int salary;
        int skill;
        int benefit;
        int mode;
        String catagory;
        int type;

        Customer customer = new Customer();
        JobMatch jobMatch = new JobMatch();
        ArrayList<Boss> itBosss = new ArrayList<>();
        ArrayList<Boss> publicBosss = new ArrayList<>();
        ArrayList<Boss> serviceBosss = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        itBosss.add(new ItBoss("eawf" , 1 , 1000, 1 , "ddd"));

        while(true)
        {
            System.out.println("모드를 입력해주세요");
            System.out.println("1.Boss 2.Customer 0.종료");
            mode = sc.nextInt();
            sc.nextLine();

            if(mode != 0 && mode != 1 && mode != 2)
            {
                mode = 0;
            }

            if(mode == 1)
            {
                System.out.println("회사 이름을 입력해주세요");
                name = sc.nextLine();

                System.out.println("초봉을 입력해주세요 | 천만단위");
                salary = sc.nextInt();

                System.out.println("요구역량 수준을 입력해주세요 | 1~5");
                skill = sc.nextInt();

                System.out.println("최고의 회사 복지 수준을 입력해주세요 | 1~5");
                benefit = sc.nextInt();

                if(skill > 5 || skill < 0)
                {
                    skill = 5;
                }

                if(benefit > 5 || benefit < 0)
                {
                    benefit = 5;
                }

                if(benefit > 5 || benefit < 0 && skill > 5 || skill < 0)
                {
                    skill = 5;
                    benefit = 5;
                }

                System.out.println("1.it 2.service 3.public");
                type = sc.nextInt();
                sc.nextLine();
                if(type == 1)
                {
                    System.out.println("회사 업무 영역을 입력해주세요");
                    catagory = sc.nextLine();
                    itBosss.add(new ItBoss(name , salary , skill , benefit , catagory));
                    System.out.println("구인이 등록되었습니다.");
                }
                if(type == 2)
                {
                    System.out.println("회사 업무 영역을 입력해주세요");
                    catagory = sc.nextLine();
                    serviceBosss.add(new ServiceBoss(name , salary , skill , benefit , catagory));
                    System.out.println("구인이 등록되었습니다.");
                }
                if(type == 3)
                {
                    System.out.println("회사 업무 영역을 입력해주세요");
                    catagory = sc.nextLine();
                    publicBosss.add(new PublicBoss(name , salary , skill , benefit , catagory));
                    System.out.println("구인이 등록되었습니다.");
                }

            }

            else if(mode == 2)
            {
                System.out.println("이름을 입력해주세요");
                sc.next();
                name = sc.nextLine();
                System.out.println("원하는 초봉을 입력해주세요 | 천만단위");
                salary = sc.nextInt();
                System.out.println("보유역량 수준을 입력해주세요 | 1~5");
                skill = sc.nextInt();
                System.out.println("요구복지 수준을 입력해주세요 | 1~5");
                benefit = sc.nextInt();

                customer.setName(name);
                customer.setSalary(salary);
                customer.setBenefit(benefit);
                customer.setSkill(skill);

                jobMatch.setMe(customer);

                System.out.println("1.it 2.service 3.public");
                type = sc.nextInt();
                if(type == 1)
                {
                    jobMatch.setBosss(itBosss);
                    jobMatch.whoBestBoss();
                }
                if(type == 2)
                {
                    jobMatch.setBosss(serviceBosss);
                    jobMatch.whoBestBoss();
                }
                if(type == 3)
                {
                    jobMatch.setBosss(publicBosss);
                    jobMatch.whoBestBoss();
                }

            }

            else if(mode == 0)
            {
                break;
            }
        }

    }
}