package chapter2.weatherstation.observer;

public class WeatherAggregate implements Observer{
    @Override
    public void performAction() {
        System.out.println("I am performing an action!");
    }
}
