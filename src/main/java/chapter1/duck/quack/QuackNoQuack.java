package chapter1.duck.quack;

public class QuackNoQuack implements QuackAction{
    @Override
    public void quack() {
        System.out.println("I do not quack!");
    }
}
