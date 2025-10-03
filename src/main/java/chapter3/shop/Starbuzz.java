package chapter3.shop;

public class Starbuzz {
    public static void main(String[] args) {
        System.out.println("Hi coffee lover");

        Espresso espresso = new Espresso();
        System.out.println(espresso.getDescription() + " R" + espresso.cost());
    }
}
