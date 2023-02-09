package com.example.itrestcontrollerunittest.controller;

import com.example.itrestcontrollerunittest.dao.SomeRepository;
import com.example.itrestcontrollerunittest.payload.Customer;
import com.example.itrestcontrollerunittest.payload.SomeObject;
import com.example.itrestcontrollerunittest.service.someService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pop", method = RequestMethod.GET)

public class SomeController1 {
  public void pop () {
    System.out.println("hello");
    for(int intial = 0; intial <= 10; intial++) {
      System.out.println();
    }
  }
}