package testAll;

public class SideDish extends Food{
    public SideDish(String name, double servedGrams, double wasteGrams) {
        super(name, servedGrams, wasteGrams);
    }

    @Override
    public String getAdvice() {
        return "반찬은 소량씩 배식하고 부족하면 추가로 배식하세요";
    }
}
