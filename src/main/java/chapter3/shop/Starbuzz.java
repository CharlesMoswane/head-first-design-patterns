package chapter3.shop;

import chapter3.shop.beverage.Espresso;
import chapter3.shop.condiment.Milk;

public class Starbuzz {
    public static void main(String[] args) {
        System.out.println("Hi coffee lover");

        Espresso espresso = new Espresso();
        System.out.println(espresso.getDescription() + " R" + espresso.cost());

        Milk espressoWithMilk = new Milk(espresso);
        System.out.println(espressoWithMilk.getDescription() + " R" + espressoWithMilk.cost());

    }
}
