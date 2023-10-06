package com.eureka.springboot.app.superheroes.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.eureka.springboot.app.superheroes.models.entity.Superheroe;

public interface SuperheroeDao extends CrudRepository<Superheroe, Long>{

}
