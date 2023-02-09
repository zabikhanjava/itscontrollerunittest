package com.example.itrestcontrollerunittest.integration;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.itrestcontrollerunittest.payload.Customer;
import com.example.itrestcontrollerunittest.payload.SomeObject;
import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.tomakehurst.wiremock.client.WireMock;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;
import static org.springframework.http.HttpHeaders.CONTENT_TYPE;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SomeTest {
  private WireMockServer wireMockServer;

  @BeforeEach
  void setup() {
    wireMockServer = new WireMockServer();
    configureFor("localhost", 8080);
    wireMockServer.start();
  }
  @LocalServerPort
      int port;
  HttpHeaders headers = new HttpHeaders();

  @Test
  public void ITTest()
  {
    TestRestTemplate testRestTemplate=new TestRestTemplate();
    HttpEntity<String> entity = new HttpEntity<String>(null, headers);

    ResponseEntity<Customer> response=testRestTemplate.exchange("http://localhost:"+port+"/somes/get/12?name=rre", HttpMethod.GET, entity, Customer.class);

    Customer expected = new Customer();
    expected.setId(12);
    expected.setNamesss("rre");

    // assertEquals( response.getBody().getNamesss(),expected.getNamesss());
    //  assertEquals( response.getBody().getId(),expected.getId());
    System.out.println("saddam"+response);
  }
  @Test
  public void ITTestsw()
  {
    stubFor(get(urlEqualTo("/somes/products/"))
        .willReturn(aResponse()
            .withStatus(HttpStatus.OK.value())
            .withHeader("Content-Type", TEXT_PLAIN_VALUE)
            .withBody("test")));


    TestRestTemplate testRestTemplate=new TestRestTemplate();
    HttpEntity<String> entity = new HttpEntity<String>(null, headers);

    ResponseEntity<Customer> response=testRestTemplate.exchange("http://localhost:"+port+"/somes/template/products", HttpMethod.GET, entity, Customer.class);

    Customer expected = new Customer();
    expected.setId(12);
    expected.setNamesss("rre");

    // assertEquals( response.getBody().getNamesss(),expected.getNamesss());
    //  assertEquals( response.getBody().getId(),expected.getId());
    System.out.println("saddam"+response);
  }

  @Test
  public void ITTestsww() {
    List<Integer> pop = new ArrayList<>();
    pop.add(2);
    pop.add(3);
    List p1 = List.of(2, 3);
    List p2 = List.of(2, 3);
    System.out.println(pop);
    System.out.println(p1);
    assertThat(pop).containsExactly(2, 3);
    RandomStringUtils.random(10).getChars(0, 10, new char[]{'a'}, 9);
  }
  @Test
  public void ITTestswww() {
    List<Integer> pop = new ArrayList<>();
    pop.add(2);
    pop.add(3);
    List p1 = List.of(2, 3);
    List p2 = List.of(2, 3);
    System.out.println(pop);
    System.out.println(p1);
    assertThat(pop).anyMatch(x->x.equals(2));
  }


}
