package com.detroitlabs.controller;

import com.detroitlabs.model.CurrencyData;
import com.detroitlabs.model.CurrencyExchanger;
import com.detroitlabs.service.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CurrencyController {

    @Autowired
    private ExchangeService exchangeService;

    @ResponseBody
    @RequestMapping("/")
    public String displayCurrencyExchange(){
        CurrencyExchanger currencyExchanger = exchangeService.fetchExchangeRateData();
        CurrencyData currencyData = currencyExchanger.getCurrencyData();
        double exchangeAmount = currencyData.exchangeUSDollars(100.00);
        return "The exchange rate in US dollars is " + exchangeAmount;


    }
}
