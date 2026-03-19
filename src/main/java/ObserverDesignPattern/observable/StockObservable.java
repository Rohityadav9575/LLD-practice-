package ObserverDesignPattern.observable;

import ObserverDesignPattern.observer.NotificationObserver;

public interface StockObservable {

    void add(NotificationObserver observer);

    void remove(NotificationObserver observer);
    void notifies();

    void setData(Integer stock);


}
