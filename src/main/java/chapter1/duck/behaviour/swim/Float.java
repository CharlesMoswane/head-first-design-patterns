package chapter1.duck.behaviour.swim;

public class Float implements SwimBehaviour {
    @Override
    public void swim() {
        System.out.println("Float like a butterfly");
    }
}
