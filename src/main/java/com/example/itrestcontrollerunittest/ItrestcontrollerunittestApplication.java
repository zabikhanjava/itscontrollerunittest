package com.example.itrestcontrollerunittest;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.itrestcontrollerunittest.payload.SomeObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableConfigurationProperties(SomeObject.class)
public class ItrestcontrollerunittestApplication {



	public static void main(String[] args) {
		assertThat("hello").isEqualTo("hello");
			SpringApplication.run(ItrestcontrollerunittestApplication.class, args);


	}

}
