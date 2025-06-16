package chapter1.duck.model;

import chapter1.duck.quack.QuackNoQuack;
import chapter1.duck.swim.Float;

public class DecoyDuck extends Duck{
    public DecoyDuck() {
        super(new QuackNoQuack(), new Float());
    }
}
