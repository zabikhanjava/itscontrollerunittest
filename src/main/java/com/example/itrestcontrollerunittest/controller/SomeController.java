package com.example.itrestcontrollerunittest.controller;

import com.example.itrestcontrollerunittest.dao.SomeRepository;
import com.example.itrestcontrollerunittest.payload.Customer;
import com.example.itrestcontrollerunittest.payload.SomeObject;

import com.example.itrestcontrollerunittest.service.someService;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import lombok.extern.log4j.Log4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/somes")
@Profile(value = {"dev", "prod"})
@PropertySource("classpath:application.properties")
@Log4j
public class SomeController {

  @Autowired
  static private Environment env;
  @Value("${some}")
  static String o;
  @Autowired
  SomeObject someObject;
  @Autowired
  someService some;

  //@Autowired
  SomeRepository someRepository;

  @GetMapping("/manga/{ids}")
  public SomeObject getSomeObject(@PathVariable int id) {
  /*  Logger logger = LoggerFactory.getLogger(SomeController.class);
    //logger.setLevel(Level.ALL);
    //SomeObject someObject=new SomeObject(id,name);
    logger.debug("debug");
    logger.info("info");
    logger.warn("warning");
    logger.error("error");
    logger.trace("hello g");

    List<String> pop= List.of("sas");
    System.out.println(pop);

    return someObject;
  }
  @GetMapping("/")
  public List<Customer> getAllObject()
  {
    return someRepository.findAll();
  }

  @PostMapping("/")
  public Customer createSomeObject(@RequestBody Customer someObject)
  {

    return someRepository.save(someObject);
  }

  @GetMapping("/{id}")
  public Optional<Customer> getOneObject(@PathVariable("id") Integer id)
  {
    return someRepository.findById(id);
  }
*/
    return someObject;
  }
  @GetMapping("/get/{id}")
  public ResponseEntity<Customer>  getOneObject(@PathVariable("id") Integer id, @RequestParam String name)
  {


    Customer customer = new Customer();
    customer.setNamesss(name);
    customer.setId(id);
    return ResponseEntity.ok(customer);
  }
 @GetMapping("/get")
 public void getOneObject() {
   System.out.println(o);
   System.out.println(env);
 }

  @GetMapping(value = "/template/products/{port}")
  public String getProductList(@PathVariable Integer port) {
    return some.pop(port);
  }
}
