package chapter3.shop;

public abstract class Beverage {
    private final String description;

    public Beverage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract int cost();
}
