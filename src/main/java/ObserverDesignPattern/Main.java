package ObserverDesignPattern;

import ObserverDesignPattern.observable.IphoneObservable;
import ObserverDesignPattern.observable.SamsungObervable;
import ObserverDesignPattern.observable.StockObservable;
import ObserverDesignPattern.observer.EmailAlertObserverImpl;
import ObserverDesignPattern.observer.NotificationObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable=new IphoneObservable();

        // now the users who want to notify
        //person one want to observe the stock of iphone
        NotificationObserver oberver1=new EmailAlertObserverImpl(iphoneStockObservable,"abc@gmail.com");
        NotificationObserver oberver2=new EmailAlertObserverImpl(iphoneStockObservable,"dfg@gmail.com");
        NotificationObserver oberver3=new EmailAlertObserverImpl(iphoneStockObservable,"hoj@gmail.com");
        NotificationObserver oberver4=new EmailAlertObserverImpl(iphoneStockObservable,"klm@gmail.com");

        iphoneStockObservable.add(oberver1);
        iphoneStockObservable.add(oberver2);
        iphoneStockObservable.add(oberver3);
        iphoneStockObservable.add(oberver4);

        iphoneStockObservable.setData(10);

        StockObservable samsungObervable=new SamsungObervable();

        NotificationObserver oberver5=new EmailAlertObserverImpl(samsungObervable,"sam@gmail.com");
        NotificationObserver oberver6=new EmailAlertObserverImpl(samsungObervable,"sung@gmail.com");

        samsungObervable.add(oberver5);
        samsungObervable.add(oberver6);

        samsungObervable.setData(20);

    }
}
