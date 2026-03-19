package ObserverDesignPattern.observable;

import ObserverDesignPattern.observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;
// this is the product under observe so its obervable
public class IphoneObservable implements StockObservable{
    //list of the persons observing it
    List<NotificationObserver> notifyList=new ArrayList<>();
    int stock=0;
    @Override
    public void add(NotificationObserver observer) {
        notifyList.add(observer);
    }

    @Override
    public void remove(NotificationObserver observer) {
        notifyList.remove(observer);
    }

    @Override
    public void notifies() {
        for (NotificationObserver observer : notifyList) {
            observer.update();
        }
    }

    @Override
    public void setData(Integer newStock) {
        if(stock==0) {
            notifies();
        }
        stock=stock+newStock;
    }

}
