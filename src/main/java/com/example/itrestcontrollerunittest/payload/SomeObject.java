package com.example.itrestcontrollerunittest.payload;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties("ha.zabi")
public class SomeObject {

  Integer id;
  String name;
}
