package chapter2.weatherstation.subject;

import chapter2.weatherstation.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherORama implements Subject{

    List<Observer> observers;

    public WeatherORama() {
        this.observers = new ArrayList<>();
    }
    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void notifyObservers() {

    }
}
