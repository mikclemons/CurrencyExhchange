package com.detroitlabs.service;

import com.detroitlabs.model.CurrencyExchanger;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ExchangeService {

    public CurrencyExchanger fetchExchangeRateData(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://www.apilayer.net/"+
                "api/live?"+
                "access_key=b679b47cee24c4f4863af866d04e9108", CurrencyExchanger.class);
    }
}
