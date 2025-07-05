package chapter1.duck.model;

import chapter1.duck.behaviour.quack.Quack;
import chapter1.duck.behaviour.quack.QuackBehaviour;
import chapter1.duck.behaviour.swim.Swim;
import chapter1.duck.behaviour.swim.SwimBehaviour;

public class MallardDuck extends Duck{

    public MallardDuck() {
        super(new Quack(), new Swim());
    }
}
