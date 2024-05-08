package com.example.restTemplateApril.service;

import com.example.restTemplateApril.dto.NewsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

    @Autowired
    RestTemplate restTemplate;

    String baseurl = "https://newsapi.org/v2/top-headlines?country=";
    public Object getNews(String countryCode, String apiKey) {
      String url = prepareUrl(countryCode, apiKey);
       NewsResponse response = restTemplate.getForObject(url, NewsResponse.class);
      return response;
    }

    private String prepareUrl(String countryCode, String apiKey) {
        return baseurl + countryCode + '&' + "apiKey= " + "apiKey";
    }
}
