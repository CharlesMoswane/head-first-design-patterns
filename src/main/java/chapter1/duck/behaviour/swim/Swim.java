package chapter1.duck.behaviour.swim;

public class Swim implements SwimBehaviour {
    @Override
    public void swim() {
        System.out.println("All ducks swim");
    }
}
