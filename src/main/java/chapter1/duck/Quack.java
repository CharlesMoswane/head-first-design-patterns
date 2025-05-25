package chapter1.duck;

public class Quack implements QuackAction{

    @Override
    public void quack() {
        System.out.println("Quack quack!");
    }
}
