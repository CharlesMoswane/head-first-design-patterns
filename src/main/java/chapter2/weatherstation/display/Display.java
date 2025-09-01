package chapter2.weatherstation.display;

public interface Display {
    default void display() {
        System.out.println("Display Initialized");
    }
}
