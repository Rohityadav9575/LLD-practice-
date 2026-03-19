package ObserverDesignPattern.observer;

import ObserverDesignPattern.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationObserver{
    StockObservable obj;
    String emailId;

    // constructor injection
    public EmailAlertObserverImpl(StockObservable obj, String emailId) {
        this.obj = obj;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendMail(emailId,"product is in the stock hurry UP!");

    }

    private void sendMail(String emailId, String s) {
        System.out.println(emailId +" + " + s);
    }
}
