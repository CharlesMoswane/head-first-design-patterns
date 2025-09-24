package chapter3.shop;

public abstract class Beverage {
    private String description;

    public String getDescription() {
        return description;
    }

    public abstract int cost();
}
