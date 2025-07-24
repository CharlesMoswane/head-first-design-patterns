package chapter1.duck.model;

import chapter1.duck.behaviour.fly.FlyNoWay;
import chapter1.duck.behaviour.quack.Squeak;
import chapter1.duck.behaviour.swim.Float;

public class RubberDuck extends Duck {
    public RubberDuck(){
        super(new Squeak(), new Float(), new FlyNoWay());
    }
}
