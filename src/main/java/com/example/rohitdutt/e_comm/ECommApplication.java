package com.example.rohitdutt.e_comm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ECommApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommApplication.class, args);
	}

}
