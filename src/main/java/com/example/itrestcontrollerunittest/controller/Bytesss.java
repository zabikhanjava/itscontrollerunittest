package com.example.itrestcontrollerunittest.controller;

import java.util.List;

public class Bytesss {

  // @Autowired
  //Hello hello;
  public static void main(String[] args) {
    System.out.println("dsds");
   /* SomeMain m = new SomeMain();
    byte[] pop=new byte[]{23,43,56,123};
    Map<String,byte[]> popop= new HashMap<>();
    popop.put("dsds", pop);
    popop.put("dsds", pop);*/
    //m.hello.displayI();
    some();
  }

  public static Integer some() {
   return List
       .of(12, 2, 30, 3, 90)
       .stream()
       .findFirst()
       .orElseThrow(() -> new RuntimeException(""));
  }

}