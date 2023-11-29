package org.example;

import java.util.ArrayList;

public class StockGrabber implements ISubject{

    private ArrayList<IObserver> observers;

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber() {
        observers = new ArrayList<IObserver>();
    }
    @Override
    public void register(IObserver o) {
        observers.add(o);
    }

    @Override
    public void unregister(IObserver o) {
        int observerIndex = observers.indexOf(o);
        System.out.println("Observer " + (observerIndex+1) + " deleted");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    public void setIBMPrice(double newIBMPrice) {
        this.ibmPrice = newIBMPrice;
        notifyObservers();
    }

    public void setAAPLPrice(double newAAPLPrice) {
        this.aaplPrice = newAAPLPrice;
        notifyObservers();
    }

    public void setGOOGPrice(double newGOOGPrice) {
        this.googPrice = newGOOGPrice;
        notifyObservers();
    }


}
