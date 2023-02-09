package com.example.itrestcontrollerunittest.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;
import java.util.Scanner;

public class Optionals {


  public static void main(String[] args) throws Throwable {


    String pop = "hello";
    if(pop.startsWith("h")) {
      pop = null;
    }
    Optional<String> op = Optional.of("some");
    String ss = op.filter(x -> x.startsWith("ws")).orElseGet(() -> Integer.toString(10));//.orElse("w");
    System.out.println(ss);
    Optionals optionals = new Optionals();
     optionals.testOrElseThrows(Optional.empty());

  }

  public void testOrElseThrow(Optional optional) throws Throwable {
    System.out.println("Optional: " + optional.orElseThrow(() -> new RuntimeException("hello sir")));

  }
  public void testOrElseThrows(Optional optional) throws Throwable {
    System.out.println("Optional: " + optional.orElseThrow(() -> new RuntimeException("hello sir")));

  }

}