package chapter1.duck.model;

import chapter1.duck.behaviour.quack.Quack;
import chapter1.duck.behaviour.quack.QuackBehaviour;
import chapter1.duck.behaviour.swim.Swim;
import chapter1.duck.behaviour.swim.SwimBehaviour;

public class Duck {

    private QuackBehaviour quackBehaviour;
    private SwimBehaviour swimBehaviour;

    public Duck() {
        this.quackBehaviour = new Quack();
        this.swimBehaviour = new Swim();
    }

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

    public QuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public SwimBehaviour getSwimBehaviour() {
        return swimBehaviour;
    }

    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }
}
