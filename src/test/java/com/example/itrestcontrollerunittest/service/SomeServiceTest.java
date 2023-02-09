package com.example.itrestcontrollerunittest.service;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.configureFor;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.apache.commons.lang3.StringUtils;

public class SomeServiceTest {
  private WireMockServer wireMockServer;

  @BeforeEach
  void setup() {
    wireMockServer = new WireMockServer();
    configureFor("localhost", 8080);
    wireMockServer.start();
  }
  @Test
  void tests() {
    stubFor(get(urlEqualTo("/somes/products/"))
        .willReturn(aResponse()
            .withStatus(HttpStatus.OK.value())
            .withHeader("Content-Type", TEXT_PLAIN_VALUE)
            .withBody("test")));

    someService some = new someService(wireMockServer.port());
    String result = some.pop(wireMockServer.port());
    System.out.println("saddam"+result);
    assertThat(result).isEqualTo("test");
    boolean po = StringUtils.isEmpty("aaaaaa");
  }
  @Test
  void testss() {
    String some = "ds";
    assertTrue(false, String.format("Device %s misses additional property DA", some));//.contains("s");
    boolean po = StringUtils.isEmpty("aaaaaa");
//    StringUtils.contains("dds");
  }
}
