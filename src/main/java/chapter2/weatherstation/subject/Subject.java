package chapter2.weatherstation.subject;

import chapter2.weatherstation.observer.Observer;

public interface Subject {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
