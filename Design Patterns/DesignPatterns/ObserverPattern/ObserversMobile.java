package DesignPatterns.ObserverPattern;

public class ObserversMobile implements Observer{
    static int counter;
    int id;
    ObserverDeviceType type;
    ObserversMobile(ObserverDeviceType type) {
        id = counter++;
        this.type = type;
    }
    @Override
    public void update(String message) {
        System.out.println("Mobile Observer " + id + " got message: " + message);
    }
}
