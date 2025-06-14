package chapter1.duck;

import chapter1.duck.swim.SwimBehaviour;

public class Duck {

    private QuackAction quackAction;
    private SwimBehaviour swimBehaviour;

    public Duck(QuackAction quackAction, SwimBehaviour swimBehaviour) {
        this.quackAction = quackAction;
        this.swimBehaviour = swimBehaviour;
    }

    public void quack() {
        quackAction.quack();
    }

    public void swim() {
        swimBehaviour.swim();
    }
}
