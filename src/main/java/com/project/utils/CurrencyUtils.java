package com.project.utils;

import org.springframework.web.client.RestTemplate;

import java.util.Map;

public class CurrencyUtils {
    private static final RestTemplate restTemplate = new RestTemplate();
    public static double getCourse(){
        String url = "https://kurs.resenje.org/api/v1/currencies/eur/rates/today";
        Map<String, Object> response = restTemplate.getForObject(url, Map.class);
        Map<String, Object> data = (Map<String, Object>) response.get("data");
        return Double.parseDouble(data.get("rate").toString());
    }
}
