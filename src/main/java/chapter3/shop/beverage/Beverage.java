package chapter3.shop.beverage;

public abstract class Beverage {
    String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract int cost();
}
