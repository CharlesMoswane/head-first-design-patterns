package chapter1.duck;

import chapter1.duck.quack.QuackNoQuack;

public class DecoyDuck extends Duck{
    public DecoyDuck() {
        super(new QuackNoQuack(), new Float());
    }
}
