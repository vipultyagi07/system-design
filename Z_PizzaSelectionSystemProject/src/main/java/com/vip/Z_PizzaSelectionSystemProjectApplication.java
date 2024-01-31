package com.vip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.vip")
public class Z_PizzaSelectionSystemProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(Z_PizzaSelectionSystemProjectApplication.class, args);
	}

}
