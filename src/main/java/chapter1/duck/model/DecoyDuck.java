package chapter1.duck.model;

import chapter1.duck.behaviour.fly.FlyNoWay;
import chapter1.duck.behaviour.quack.MuteQuack;
import chapter1.duck.behaviour.swim.Float;

public class DecoyDuck extends Duck{
    public DecoyDuck() {
        super(new MuteQuack(), new Float(), new FlyNoWay());
    }
}
