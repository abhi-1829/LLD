package DesignPatterns.ObserverPattern;

import java.util.List;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(String message);
    void setData();
}
