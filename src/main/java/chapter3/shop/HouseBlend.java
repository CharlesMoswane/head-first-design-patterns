package chapter3.shop;

public class HouseBlend extends Beverage{

    public HouseBlend(String description) {
        description = "House blend coffee";
    }

    @Override
    public int cost() {
        return 20;
    }
}
