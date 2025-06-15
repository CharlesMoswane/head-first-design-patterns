package chapter1.duck.swim;

public class Swim implements SwimBehaviour {
    @Override
    public void swim() {
        System.out.println("All ducks swim");
    }
}
