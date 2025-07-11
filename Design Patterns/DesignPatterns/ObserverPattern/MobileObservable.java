package DesignPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class MobileObservable implements Observable{
    List<Observer> observers;

    MobileObservable() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for(Observer o : observers) {
            o.update(message);
        }
    }

    @Override
    public void setData() {

    }
}
