package chapter1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi Chapter 1");
        List<Duck> ducks = new ArrayList<>();
        Duck duck = new Duck();
        MallardDuck mallardDuck = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();

        ducks.add(duck);
        ducks.add(mallardDuck);
        ducks.add(rubberDuck);

        for (Duck d: ducks) {
            duck.quack();
            duck.swim();
        }

        rubberDuck.quack();
    }
}