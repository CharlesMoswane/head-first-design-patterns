package chapter2;

import chapter2.weatherstation.observer.WeatherAggregate;
import chapter2.weatherstation.subject.WeatherORama;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello chapter, how are your publishers and subscribers?");

        WeatherAggregate weatherAggregate = new WeatherAggregate();

        WeatherORama weatherORama = new WeatherORama();

        weatherORama.addObserver(weatherAggregate);
        weatherORama.notifyObservers();
    }
}
