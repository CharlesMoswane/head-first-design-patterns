package chapter1.duck.behaviour.quack;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I do not quack!");
    }
}
