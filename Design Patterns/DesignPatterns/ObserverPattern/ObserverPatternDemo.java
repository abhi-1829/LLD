package DesignPatterns.ObserverPattern;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Observer o1 = new ObserversMobile(ObserverDeviceType.MOBILE);
        Observer o2 = new ObserversMobile(ObserverDeviceType.MOBILE);
        Observable mobile = new MobileObservable();
        Observer o3 = new ObserversTV(ObserverDeviceType.TV);
        Observer o4 = new ObserversTV(ObserverDeviceType.TV);
        Observable tv = new TVObservable();
        mobile.addObserver(o1);
        mobile.addObserver(o2);
        mobile.notifyObserver("ABC");
        tv.addObserver(o3);
        tv.addObserver(o4);
        tv.notifyObserver("DEF");
    }
}
