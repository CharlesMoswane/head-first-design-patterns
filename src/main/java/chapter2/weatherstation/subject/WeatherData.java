package chapter2.weatherstation.subject;

import chapter2.weatherstation.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    List<Observer> observers;

    private int temperature;
    private int humidity;
    private int pressure;
    private boolean measurementsChanged;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.performAction();
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public boolean isMeasurementsChanged() {
        return measurementsChanged;
    }
}
