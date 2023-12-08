package com.example.tut.tut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TutApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TutApplication.class, args);

		Alien a = context.getBean(Alien.class);

		a.show();
	}

}
