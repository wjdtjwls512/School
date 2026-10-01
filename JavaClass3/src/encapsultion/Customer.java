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

    sellPhone(model, budget);
}
