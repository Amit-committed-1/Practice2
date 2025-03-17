package com.psa1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class X1Application {

	String name = "Amit Kumar Bhanjbabu";
	int age = 25;
	float num = 123.56f;
	String degree = "BCA";
	public static void main(String[] args) {
		SpringApplication.run(X1Application.class, args);
	}

}
