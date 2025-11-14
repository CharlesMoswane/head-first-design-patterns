package chapter3.shop.condiment;

import chapter3.shop.beverage.Beverage;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
        description = "Milk";
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with " + description;
    }

    @Override
    public int cost() {
        return beverage.cost() + 5;
    }
}
