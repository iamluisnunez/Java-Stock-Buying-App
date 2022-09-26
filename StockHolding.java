package com.kenzie.app;

public class StockHolding {
    // Create private instance properties
    private String name = "Kenzie";
    private String ticker = "KENZ";
    private double price = 0;
    private int numShares = 0;

    // Create constructor
    public StockHolding(String name, String ticker, double price){
        this.name = name;
        this.ticker = ticker;
        this.price = price;
    }
    // create getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumShares() {
        return numShares;
    }

    public void setNumShares(int numShares) {
        this.numShares = numShares;
    }

    // create buy, sell, and getBalance methods
    public void buy(int numShares){
        this.numShares += numShares;
    }
    public double sell(int numShares){
        double totalSold = 0;
        if(this.numShares > numShares){
            totalSold = numShares * this.price;
            this.numShares -= numShares;
        }
        return totalSold;
    }
    public double getBalance(){

        return this.numShares * this.price;
    }

}
