package com.eureka.springboot.app.organizaciones.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.eureka.springboot.app.organizaciones.models.entity.Organizacion;

public interface OrganizacionDao extends CrudRepository<Organizacion, Long> {

}
