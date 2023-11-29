package org.example.Thread;

import org.example.ISubject;
import org.example.StockGrabber;

public class GetTheStock implements Runnable{

    private int startTime;
    private String stock;
    private double price;

    private ISubject stockGrabber;

    public GetTheStock(ISubject stockGrabber, int newStartTime, String newStock, double newPrice) {
        this.stockGrabber = stockGrabber;
        this.startTime = newStartTime;
        this.stock = newStock;
        this.price = newPrice;
    }

    @Override
    public void run() {
        for(int i=1; i<=20; i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            double randNum = (Math.random() * (.06)) - .03;
            price = price + randNum;

            if(stock == "IBM") ((StockGrabber)stockGrabber).setIBMPrice(price);
            if(stock == "AAPL") ((StockGrabber)stockGrabber).setAAPLPrice(price);
            if (stock == "GOOG") ((StockGrabber)stockGrabber).setGOOGPrice(price);

            System.out.println(stock + ": " + String.format("%.2f", price) + " " + String.format("%.2f", randNum));
            System.out.println();

        }
    }
}
