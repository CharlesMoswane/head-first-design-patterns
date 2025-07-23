package chapter1.duck.model;

import chapter1.duck.behaviour.fly.FlyWithWings;
import chapter1.duck.behaviour.quack.Quack;
import chapter1.duck.behaviour.swim.Swim;

public class MallardDuck extends Duck{

    public MallardDuck() {
        super(new Quack(), new Swim(), new FlyWithWings());
    }
}
