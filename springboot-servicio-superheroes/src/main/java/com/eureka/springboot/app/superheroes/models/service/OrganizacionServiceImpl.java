package com.eureka.springboot.app.superheroes.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eureka.springboot.app.superheroes.models.dao.OrganizacionDao;
import com.eureka.springboot.app.superheroes.models.entity.Organizacion;

@Service
public class OrganizacionServiceImpl implements OrganizacionService {

	@Autowired
	OrganizacionDao organizacionDao;
	
	@Override
	public Organizacion createOrganizacion(Organizacion organizacion) {
		return organizacionDao.save(organizacion);
	}

	@Override
	public void deleteOrganizacion(Long id) {
		organizacionDao.deleteById(id);
	}

}
