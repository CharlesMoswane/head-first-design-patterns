package chapter1;

import chapter1.duck.model.DecoyDuck;
import chapter1.duck.model.Duck;
import chapter1.duck.model.MallardDuck;
import chapter1.duck.model.RubberDuck;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi Chapter 1");
        List<Duck> ducks = new ArrayList<>();
        Duck duckOg = new Duck();
        MallardDuck mallardDuck = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();

        ducks.add(duckOg);
        ducks.add(mallardDuck);
        ducks.add(rubberDuck);
        ducks.add(decoyDuck);

        for (Duck duck: ducks) {
            duck.quack();
            duck.swim();
        }
    }
}