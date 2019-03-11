package com.detroitlabs.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrencyExchanger {


    private String name;
    private CurrencyData currencyData;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("quotes")
    public CurrencyData getCurrencyData() {
        return currencyData;
    }

    @JsonProperty("quotes")
    public void setCurrencyData(CurrencyData currencyData) {
        this.currencyData = currencyData;
    }
}

