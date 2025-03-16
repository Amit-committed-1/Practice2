package com.psa1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class X1Application {

	String name = "Amit";
	String emailId = "Amit@gmail.com";
	String graduation = "BCA";
	public static void main(String[] args) {
		SpringApplication.run(X1Application.class, args);
	}

}
