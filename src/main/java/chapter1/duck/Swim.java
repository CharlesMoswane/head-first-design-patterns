package chapter1.duck;

public class Swim implements SwimBehaviour{
    @Override
    public void swim() {
        System.out.println("All ducks swim");
    }
}
