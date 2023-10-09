package com.eureka.springboot.app.estadisticasorg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eureka.springboot.app.estadisticasorg.models.Estadistica;


import com.eureka.springboot.app.estadisticasorg.models.service.EstadisticaService;

@RestController
public class EstadisticaController {
	@Autowired
	private EstadisticaService estadisticaService;
	
	@GetMapping("/listar")
	public List<Estadistica> getAllOrganizaciones() {
		return estadisticaService.getAllEstadisticas();
	}
}
