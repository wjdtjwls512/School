package testAll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WasteManager ws = new WasteManager();

        String name;
        double gram;
        double wasteGram;

        System.out.println("추가할 음식갯수를 입력하시요.");

        int count = sc.nextInt();

        for(int i = 0 ; i < count ; i++)
        {
            System.out.println("1. 음식 종류 (1: 밥류, 2: 반찬류)");

            int type = sc.nextInt();

            if(type == 1)
            {
                System.out.println("2. 음식명");
                sc.next();
                name = sc.nextLine();
                System.out.println("3. 배식량(g)");
                gram = sc.nextInt();
                System.out.println("4. 잔반량(g)");
                wasteGram = sc.nextInt();
                ws.addFood(new RiceFood(name , gram ,wasteGram));
            }

            if (type == 2)
            {
                System.out.println("2. 음식명");
                sc.next();
                name = sc.nextLine();
                System.out.println("3. 배식량(g)");
                gram = sc.nextInt();
                System.out.println("4. 잔반량(g)");
                wasteGram = sc.nextInt();
                ws.addFood(new SideDish(name , gram ,wasteGram));
            }
        }
        System.out.println("===== 학교 급식 잔반 분석 결과 =====");
        System.out.println();
        for(Food f : ws.foods)
        {
            System.out.println("음식명: "+f.getName());
            System.out.println("배식량: "+f.getServedGrams());
            System.out.println("잔반량: "+f.getWasteGrams());
            System.out.println("잔반률: "+f.getWasteRate());
            System.out.println("개선 안내: "+f.getAdvice());
            System.out.println();
        }
        System.out.println("===== 전체 잔반 분석 =====");
        ws.printReport();
    }
}