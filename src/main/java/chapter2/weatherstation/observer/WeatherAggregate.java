package chapter2.weatherstation.observer;

import chapter2.weatherstation.display.Display;

public class WeatherAggregate implements Observer, Display {
    @Override
    public void performAction() {
        System.out.println("I am performing an action!");
    }
}
