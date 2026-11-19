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
                System.out.println(f.getName());
                System.out.println(f.getServedGrams());
                total_gram += f.getServedGrams();
                System.out.println(f.getWasteGrams());
                total_waste_gram += f.getWasteGrams();
                System.out.println(f.getWasteRate());
                System.out.println(f.getAdvice());
            }
            System.out.println((total_gram / total_waste_gram) * 100);
        }
    }



}