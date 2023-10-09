package com.eureka.springboot.app.superheroes.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.eureka.springboot.app.superheroes.models.entity.Organizacion;

public interface OrganizacionDao extends CrudRepository<Organizacion, Long>{

}
