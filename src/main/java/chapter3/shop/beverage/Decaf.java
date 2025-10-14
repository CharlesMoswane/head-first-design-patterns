package chapter3.shop.beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public int cost() {
        return 0;
    }
}
