// This class defines all characteristics of a general stock entity

package com.project.StockScreener.stock;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// Ignore JSON properties that are not defined
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stock {
    // private variables
    private String symbol;
    private double open;
    private double close;

    // constructor
    public Stock() {}

    // setters
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public void setOpen(double open) {
        this.open = open;
    }
    public void setClose(double close) {
        this.close = close;
    }

    // getters
    public String getSymbol() {
        return symbol;
    }
    public double getOpen() {
        return open;
    }
    public double getClose() {
        return close;
    }

    // to string
    @Override
    public String toString() {
        return "Symbol: " + symbol + "\nOpen Price: $" + open + "\nClose Price: $" + close;
    }


}
