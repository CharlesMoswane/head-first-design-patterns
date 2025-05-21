package chapter1.duck;

public class Duck {

    private QuackAction quackAction;
    private SwimAction swimAction;

    public Duck(QuackAction quackAction, SwimAction swimAction) {
        this.quackAction = quackAction;
        this.swimAction = swimAction;
    }

    public void quack() {
        System.out.println("Quack");
    }

    public void swim() {
        System.out.println("Float like a butterfly");
    }
}
