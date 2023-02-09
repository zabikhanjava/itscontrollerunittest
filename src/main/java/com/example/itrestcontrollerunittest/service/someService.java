package com.example.itrestcontrollerunittest.service;

import java.util.Arrays;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class someService {

  Integer port;

  public someService() {
  }

  public someService(Integer port) {
    this.port = port;
  }
  public String pop(Integer port) {

    this.port = port;

    RestTemplate restTemplate = new RestTemplate();

    HttpHeaders headers = new HttpHeaders();
    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
    HttpEntity<String> entity = new HttpEntity<String>(headers);

    return restTemplate.exchange("http://localhost:"+port+"/somes/products/", HttpMethod.GET, entity, String.class).getBody();
  }
}
