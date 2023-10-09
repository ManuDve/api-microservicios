package com.eureka.springboot.app.estadisticasorg.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eureka.springboot.app.estadisticasorg.clients.OrganizacionClienteRest;
import com.eureka.springboot.app.estadisticasorg.models.Estadistica;
import com.eureka.springboot.app.estadisticasorg.models.Organizacion;

@Service
public class EstadisticaFeignImpl implements EstadisticaService {
	
	@Autowired
	private OrganizacionClienteRest clienteRest;

	@Override
	public List<Estadistica> getAllEstadisticas() {
		return clienteRest.getAllOrganizaciones().stream().map(o -> new Estadistica(o, 1)).collect(Collectors.toList());
	}

	@Override
	public Estadistica getEstadisticaById(Long id) {
		// TODO Auto-generated method stub
		return new Estadistica(clienteRest.getOrganizacionById(id), 1);
	}



}
