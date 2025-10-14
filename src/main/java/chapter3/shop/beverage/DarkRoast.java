package chapter3.shop.beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public int cost() {
        return 0;
    }
}
