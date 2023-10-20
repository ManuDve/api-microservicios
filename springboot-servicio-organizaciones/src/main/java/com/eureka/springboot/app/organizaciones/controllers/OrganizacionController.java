package com.eureka.springboot.app.organizaciones.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.springboot.app.organizaciones.models.entity.Organizacion;
import com.eureka.springboot.app.organizaciones.models.service.IOrganizacionService;


@RestController
public class OrganizacionController {
	
	@Autowired
	private IOrganizacionService organizacionService;
	
	@GetMapping
	public List<Organizacion> getAllOrganizaciones() {
		return organizacionService.getAllOrganizaciones();
	}
	
	@GetMapping("/{id}")
	public Organizacion getOrganizacionById(@PathVariable Long id) {
		return organizacionService.getOrganizacionById(id);
	}
	
	@PostMapping
	public Organizacion createOrganizacion(@RequestBody Organizacion organizacion) {
		return organizacionService.createOrganizacion(organizacion);
	}
	
	@DeleteMapping("/{id}")
	public void deleteOrganizacion(@PathVariable Long id) {
		organizacionService.deleteOrganizacionById(id);
	}
	

}
