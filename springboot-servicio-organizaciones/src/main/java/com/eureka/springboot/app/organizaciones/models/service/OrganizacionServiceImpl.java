package com.eureka.springboot.app.organizaciones.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eureka.springboot.app.organizaciones.models.dao.OrganizacionDao;
import com.eureka.springboot.app.organizaciones.models.entity.Organizacion;

@Service
public class OrganizacionServiceImpl implements IOrganizacionService {
	
	@Autowired
	private OrganizacionDao organizacionDao;


	@Override
	@Transactional
	public void deleteOrganizacionById(Long id) {
		organizacionDao.deleteById(id);		
	}

	@Override
	@Transactional
	public Organizacion createOrganizacion(Organizacion organizacion) {
		return organizacionDao.save(organizacion);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Organizacion> getAllOrganizaciones() {
		return (List<Organizacion>) organizacionDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Organizacion getOrganizacionById(Long id) {
		return organizacionDao.findById(id).orElse(null);
	}


}
