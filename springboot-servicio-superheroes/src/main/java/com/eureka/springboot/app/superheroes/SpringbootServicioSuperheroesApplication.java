package com.eureka.springboot.app.superheroes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringbootServicioSuperheroesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioSuperheroesApplication.class, args);
	}

}
