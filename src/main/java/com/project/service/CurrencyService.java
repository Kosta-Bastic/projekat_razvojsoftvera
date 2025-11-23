package com.project.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.Map;

@Service
public class CurrencyService {
    private final RestTemplate restTemplate = new RestTemplate();
    public BigDecimal getCourse(){
        String url = "https://kurs.resenje.org/api/v1/currencies/eur/rates/today";
        Map<String, Object> response = restTemplate.getForObject(url, Map.class);
        Map<String, Object> data = (Map<String, Object>) response.get("data");
        return new BigDecimal(data.get("rate").toString());
    }
}
