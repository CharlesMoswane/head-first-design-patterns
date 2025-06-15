package chapter1.duck;

import chapter1.duck.swim.SwimBehaviour;

public class Float implements SwimBehaviour {
    @Override
    public void swim() {
        System.out.println("Float like a butterfly");
    }
}
