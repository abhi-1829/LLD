package DesignPatterns.ObserverPattern;

public class ObserversTV implements Observer{
    static int counter;
    int id;
    ObserverDeviceType type;
    ObserversTV(ObserverDeviceType type) {
        id = counter++;
        this.type = type;
    }
    @Override
    public void update(String message) {
        System.out.println("TV Observer " + id + " got message: " + message);
    }
}
