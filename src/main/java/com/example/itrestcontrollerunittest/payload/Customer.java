package com.example.itrestcontrollerunittest.payload;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

  //@Id
  //@GeneratedValue
  Integer id;
  String namesss;

  Integer age;
  String place;
  Integer amount;

  public Customer(String namesss) {
    this.namesss = namesss;
  }
}
