package chapter1.duck.behaviour.quack;

public class Quack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Quack quack!");
    }
}
