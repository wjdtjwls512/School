package testAll;

import java.util.ArrayList;

public class WasteManager {
    ArrayList<Food> foods = new ArrayList<>();
    public static final double TARGET_RATE = 20.0;
    double total_gram = 0;
    double total_waste_gram = 0;

    public void addFood(Food food)
    {
        foods.add(food);
    }

    public void printReport()
    {
        if( foods == null )
        {
            System.out.println("등록된 잔반이 없습니다.");
        }
        else
        {
            for(Food f : foods)
            {
                total_gram += f.getServedGrams();
                total_waste_gram += f.getWasteGrams();
            }

            System.out.println("전체 배식량: "+total_gram+"g");
            System.out.println("전체 잔반량: "+total_waste_gram+"g");
            System.out.printf("전체 잔반율: %.1f%%\n",(total_waste_gram / total_gram) * 100);

            if(((total_waste_gram / total_gram) * 100) >= TARGET_RATE)
            {
                System.out.println("잔반을 줄이기 위한 개선이 필요합니다.");
            }
            else
            {
                System.out.println("목표 잔반율을 달성했습니다.");
            }
        }
    }



}