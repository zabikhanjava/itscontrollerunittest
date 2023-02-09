package com.example.itrestcontrollerunittest.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.itrestcontrollerunittest.payload.SomeObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

public class SomeIntegration {


  @Test
  public void ITTest()
  {


  /*  assertEquals( response.getBody().getName(),expected.getName());
    assertEquals( response.getBody().getId(),expected.getId());
    System.out.println(response); */
  }
}
