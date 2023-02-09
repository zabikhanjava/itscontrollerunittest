package com.example.itrestcontrollerunittest.learnbeanspringconfig;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class RandomClass {

  public void DisplayRandom()
  {
    System.out.println("displaying from Random");
  }
}
