package testAll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WasteManager ws = new WasteManager();

        String name;
        double gram;
        double wasteGram;

        int count = sc.nextInt();
        for(int i = 0 ; i < count ; i++)
        {
            System.out.println("1. 음식 종류 (1: 밥류, 2: 반찬류)");
            int number = sc.nextInt();

            if(number == 1)
            {
                System.out.println("2. 음식명");
                name = sc.nextLine();
                sc.nextLine();
                System.out.println("3. 배식량(g)");
                gram = sc.nextInt();
                sc.nextLine();
                System.out.println("4. 잔반량(g)");
                wasteGram = sc.nextInt();
                ws.addFood(new RiceFood(name , gram ,wasteGram));
            }

            if (number == 2)
            {
                System.out.println("2. 음식명");
                name = sc.nextLine();
                sc.nextLine();
                System.out.println("3. 배식량(g)");
                gram = sc.nextInt();
                System.out.println("4. 잔반량(g)");
                wasteGram = sc.nextInt();
                ws.addFood(new SideDish(name , gram ,wasteGram));
            }
            ws.printReport();
        }
    }
}