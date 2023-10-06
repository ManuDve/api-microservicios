package com.eureka.springboot.app.superheroes.models.service;

import java.util.List;

import com.eureka.springboot.app.superheroes.models.entity.Superheroe;

public interface ISuperheroeService {
	public List<Superheroe> getAllSuperheroes();
	public Superheroe getSuperheroeById(Long id);
	public Superheroe createSuperheroe(Superheroe superheroe);
	public void deleteSuperheroeById(Long id);
}
