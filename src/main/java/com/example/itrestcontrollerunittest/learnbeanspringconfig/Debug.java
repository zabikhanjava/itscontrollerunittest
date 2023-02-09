package com.example.itrestcontrollerunittest.learnbeanspringconfig;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import lombok.extern.log4j.Log4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@Log4j
public class Debug {

  public static void main(String[] args) {
    log.error("hello");
    List<Integer> list = new ArrayList();
    list = (List) List.of(12, 34);
    list.stream().map(x-> {
    int a = 10;
    return a+x.toString();

    });
    BiFunction<Integer, Integer, Integer> add = (a, b) -> a+b;
    System.out.println("The addition of two numbers are: "+ add.apply(3,2));

    System.out.println("before loop");
    for (int initailValue = 0; initailValue <= 10; initailValue++) {
      someThing();
      System.out.println(" inside loop hello"+initailValue);
    }
    System.out.println("after loop");

  }
  public static void someThing() {
    System.out.println("insde method");
  }
}
