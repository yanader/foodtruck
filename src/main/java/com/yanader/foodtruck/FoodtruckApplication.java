package com.yanader.foodtruck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EntityScan(basePackages = "com.northcoders.surfeillance.model")
@ComponentScan(basePackages = {"com.yanader.foodtruck"})
public class FoodtruckApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodtruckApplication.class, args);
	}

}
