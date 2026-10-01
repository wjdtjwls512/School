package encapsultion;

public class Customer {
    private String name;
    private String model;
    private double budget;

    public Customer (String name, String model, double budget) {
        this.name = name;
        this.model = model;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getBudget() {
        return budget;
    }

    public void buyPhone(PhoneStore store) {
        Phone phone = store.sellPhone(model, budget);

        // 구매가 가능하면 구입완료 출력, 불가능하면 구입 불가능 출력
        if (phone != null) {
            System.out.println("고객: 핸드폰 구입이 완료되었습니다.");
        } else {
            System.out.println("고객: 핸드폰을 구입하지 못했습니다.");
        }
    }
}
