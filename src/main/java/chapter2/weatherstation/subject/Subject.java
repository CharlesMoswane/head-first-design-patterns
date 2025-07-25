package chapter2.weatherstation.subject;

import chapter2.weatherstation.observer.Observer;

public interface Subject {
    public void notify(Observer observer);
}
