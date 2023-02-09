package com.example.itrestcontrollerunittest.controller;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import com.example.itrestcontrollerunittest.payload.SomeObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@WebMvcTest(SomeController.class)
class SomeControllerTest {

  @Autowired
  MockMvc mvc;

 /* @Test
  public void getSomeTest() throws Exception {
    String name = "Boot";
    MultiValueMap<String, String> paramsMap = new LinkedMultiValueMap<>();
    paramsMap.add("name", name);

    MvcResult mvcResult =mvc.perform(get("/some/get/12").params(paramsMap)).andReturn();
   int status= mvcResult.getResponse().getStatus();
   Assertions.assertThat(status).isEqualTo(200);
    assertEquals(200,status);
    mvcResult.getResponse().getContentAsString();
    ObjectMapper objectMapper = new ObjectMapper();
    SomeObject productlist = objectMapper.readValue( mvcResult.getResponse().getContentAsString(), SomeObject.class);
    assertEquals(productlist.getId(),12);
    assertEquals(productlist.getName(),"Boot");

  }*/
}
