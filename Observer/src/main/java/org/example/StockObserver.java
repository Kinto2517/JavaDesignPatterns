package org.example;

public class StockObserver implements IObserver{

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int observerIDTracker = 0;

    private int observerID;

    private ISubject stockGrabber;

    public StockObserver(ISubject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        System.out.println("New Observer " + this.observerID);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        printThePrices();
    }

    private void printThePrices() {
        System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " + aaplPrice + "\nGOOG: " + googPrice + "\n");

    }
}
