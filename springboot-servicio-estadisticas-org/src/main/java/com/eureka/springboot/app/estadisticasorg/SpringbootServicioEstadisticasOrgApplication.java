package com.eureka.springboot.app.estadisticasorg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringbootServicioEstadisticasOrgApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioEstadisticasOrgApplication.class, args);
	}

}
