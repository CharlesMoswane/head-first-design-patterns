package chapter3.shop.condiment;

import chapter3.shop.beverage.Beverage;

public class CondimentDecorator extends Beverage {
    /**
     * @return
     */
    @Override
    public int cost() {
        return 0;
    }
}
