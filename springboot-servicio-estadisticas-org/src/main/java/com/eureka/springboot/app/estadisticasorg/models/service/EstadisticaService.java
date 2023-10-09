package com.eureka.springboot.app.estadisticasorg.models.service;

import java.util.List;

import com.eureka.springboot.app.estadisticasorg.models.Estadistica;

public interface EstadisticaService {
	public List<Estadistica> getAllEstadisticas();
	public Estadistica getEstadisticaById(Long id);
}
