package com.eureka.springboot.app.superheroes.clientes;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.eureka.springboot.app.superheroes.models.entity.Organizacion;

@FeignClient("servicio-organizaciones")
public interface OrganizacionClienteRest {
	@GetMapping("/{id}")
	public Organizacion getOrganizacionById(@PathVariable Long id);
}
