package chapter1.duck.behaviour.quack;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I don't quack, I squeeeeeeeeeak");
    }
}
