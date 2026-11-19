package testAll;

public class RiceFood extends Food{
    public RiceFood(String name, double servedGrams, double wasteGrams) {
        super(name, servedGrams, wasteGrams);
    }

    @Override
    public String getAdvice() {
        return "밥은 개인의 식사량에 맞게 조절하세요";
    }
}
