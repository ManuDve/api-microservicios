package com.eureka.springboot.app.superheroes.models.service;

import com.eureka.springboot.app.superheroes.models.entity.Organizacion;

public interface OrganizacionService {
	public Organizacion createOrganizacion(Organizacion organizacion);
	public void deleteOrganizacion(Long id);
}
