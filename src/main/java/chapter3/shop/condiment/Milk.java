package chapter3.shop.condiment;

import chapter3.shop.beverage.Beverage;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return super.cost() + 5;
    }
}
