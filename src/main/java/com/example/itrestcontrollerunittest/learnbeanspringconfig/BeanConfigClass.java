package com.example.itrestcontrollerunittest.learnbeanspringconfig;

import com.example.itrestcontrollerunittest.payload.Customer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ConditionalOnBean(name = "randomClasssssssss")
@ComponentScan("com.example.itrestcontrollerunittest")
//@ComponentScan("com.example.apachecorekafka")
@PropertySource("classpath:application.properties")

public class BeanConfigClass {

 /* @Bean
  public RandomClass randomClasssssssss()
  {
    return new RandomClass();
  }
  @Bean
  public BeanMainTest beanMainTest(RandomClass randomClass)
  {
    return new BeanMainTest(randomClass);
  }
  */
 @Bean
 @ConditionalOnClass(value = RandomClass.class)
 public BeanMainTest beanMainTestssssssssssSS()
 {
  return new BeanMainTest();
 }

 @Bean
 @Conditional(MyCondition.class)
 public BeanMainTest beanMainTestssssssssss()
 {
  return new BeanMainTest();
 }

 @ConditionalOnProperty(
     name = "ha.zabi.name",
     havingValue = "saddam")
 @Bean
 public BeanMainTest beanMainTest()
 {
  return new BeanMainTest();
 }

 @Bean
 //@Profile("oracle")
 public Customer oracleDataSource(){
  Customer dataSource = new Customer("oracle");
  // implementation skipped
  return dataSource;
 }


 @Bean
 //@Profile("mysql")
 public Customer mySqlDataSource(){
  Customer dataSource = new Customer("mysql");;
  // implementation skipped
  return dataSource;
 }

}
