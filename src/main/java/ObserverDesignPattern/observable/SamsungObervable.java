package ObserverDesignPattern.observable;

import ObserverDesignPattern.observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class SamsungObervable implements StockObservable{
    // will have list of oberver who is observing this stock
    List<NotificationObserver> samsungObservers=new ArrayList<>();
    int stock=0;
    @Override
    public void add(NotificationObserver observer) {
       samsungObservers.add(observer);
    }

    @Override
    public void remove(NotificationObserver observer) {
        samsungObservers.remove(observer);
    }

    @Override
    public void notifies() {
        for(NotificationObserver observer : samsungObservers){
            observer.update();
        }
    }

    @Override
    public void setData(Integer newStock) {
        if(stock==0){
            notifies();
        }
        stock=stock+newStock;
    }
}
