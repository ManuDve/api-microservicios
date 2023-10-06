package com.eureka.springboot.app.organizaciones.models.service;

import java.util.List;

import com.eureka.springboot.app.organizaciones.models.entity.Organizacion;

public interface IOrganizacionService {
	public List<Organizacion> getAllOrganizaciones();
	public Organizacion getOrganizacionById(Long id);
	public void deleteOrganizacionById(Long id);
	public Organizacion createOrganizacion(Organizacion organizacion);
}
