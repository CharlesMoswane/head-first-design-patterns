package chapter1.duck;

public class Duck {

    private QuackAction quackAction;
    private SwimAction swimAction;

    public void quack() {
        System.out.println("Quack");
    }

    public void swim() {
        System.out.println("Float like a butterfly");
    }
}
