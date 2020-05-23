package com.propertydekho.infoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.propertydekho.infoservice")
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class InfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfoServiceApplication.class, args);
	}

}
