package com.eureka.springboot.app.organizaciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringbootServicioOrganizacionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioOrganizacionesApplication.class, args);
	}

}
