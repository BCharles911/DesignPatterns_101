package com.observerPattern;

public class Main {

    public static void main(String[] args) {


        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(675.00);
        stockGrabber.setGOOGPrice(557.00);


    }
}
