package com.detroitlabs.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrencyData {

    private double USDAED;
    private double USDollars;


    public double exchangeUSDollars(double USDollars){
        return USDollars * getUSDAED();
    }

    public double getUSDAED() {
        return USDAED;
    }

    public void setUSDAED(double USDAED) {
        this.USDAED = USDAED;
    }

    public double getUSDollars() {
        return USDollars;
    }

    public void setUSDollars(double USDollars) {
        this.USDollars = USDollars;
    }
}
