package com;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReverseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReverseApplication.class, args);
	}

	@Bean
	public Function<String,String> reverse(){
		return (input)-> new StringBuilder(input).reverse().toString();
	}
}
