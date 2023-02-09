package com.example.itrestcontrollerunittest.learnbeanspringconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

public class BeanMainTest {


  RandomClass randomClass;



  public void setRandomClass(RandomClass randomClass) {
    this.randomClass = randomClass;
  }
 // @Autowired
  public BeanMainTest(RandomClass randomClass)
  {
    this.randomClass=randomClass;
  }
  public BeanMainTest()
  {
  }

  public static void main(String[] args) {
    ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfigClass.class);
    BeanMainTest beanMainTest= (BeanMainTest) context.getBean("beanMainTestssssssssssSS");
    BeanMainTest beanMainTest1= (BeanMainTest) context.getBean("beanMainTestssssssssss");
    BeanMainTest beanMainTest12= (BeanMainTest) context.getBean("beanMainTest");
    String strinmg= (String) context.getBean(String.class);
    System.out.println(strinmg);
    /*RandomClass ran =context.getBean(RandomClass.class);
    beanMainTest.randomClass.DisplayRandom();
    ran.DisplayRandom();*/
  }
}
