package chapter1;

import chapter1.duck.model.DecoyDuck;
import chapter1.duck.model.MallardDuck;
import chapter1.duck.model.RubberDuck;

import java.util.ArrayList;
import java.util.List;

public class Duck {
    public static void main(String[] args) {
        System.out.println("Hi Chapter 1");
        List<chapter1.duck.model.Duck> ducks = new ArrayList<>();
        chapter1.duck.model.Duck duckOg = new chapter1.duck.model.Duck();
        MallardDuck mallardDuck = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();

        ducks.add(duckOg);
        ducks.add(mallardDuck);
        ducks.add(rubberDuck);
        ducks.add(decoyDuck);

        for (chapter1.duck.model.Duck duck: ducks) {
            duck.quack();
            duck.swim();
        }
    }
}