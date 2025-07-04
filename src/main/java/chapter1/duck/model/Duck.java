package chapter1.duck.model;

import chapter1.duck.behaviour.quack.QuackBehaviour;
import chapter1.duck.behaviour.swim.SwimBehaviour;

public class Duck {

    private QuackBehaviour quackBehaviour;
    private SwimBehaviour swimBehaviour;

    public Duck(QuackBehaviour quackBehaviour, SwimBehaviour swimBehaviour) {
        this.quackBehaviour = quackBehaviour;
        this.swimBehaviour = swimBehaviour;
    }

    public void quack() {
        quackBehaviour.quack();
    }

    public void swim() {
        swimBehaviour.swim();
    }
}
