package testAll;

public class Food {
    private String name;
    private double servedGrams;
    private double wasteGrams;
    private static int foodCount;

    public Food(String name, double servedGrams, double wasteGrams) {
        this.name = name;
        this.servedGrams = servedGrams;
        this.wasteGrams = wasteGrams;
        foodCount++;
    }

    public String getName() {
        return name;
    }

    public double getServedGrams() {
        return servedGrams;
    }

    public double getWasteGrams() {
        return wasteGrams;
    }

    public double getWasteRate() {
        return wasteGrams / servedGrams * 100;
    }

    public String getAdvice() {
        return "적정량을 배식하고 잔반을 줄이세요";
    }

    public static int getFoodCount() {
        return foodCount;
    }
}
