package com.eureka.springboot.app.superheroes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.springboot.app.superheroes.models.entity.Superheroe;
import com.eureka.springboot.app.superheroes.models.service.ISuperheroeService;

@RestController
public class SuperheroeController {

	@Autowired
	private ISuperheroeService superheroeService;
	
	@GetMapping
	public List<Superheroe> getAllSuperheroes(){
		return superheroeService.getAllSuperheroes();
	}
	
	@GetMapping("/{id}")
	public Superheroe getSuperheroeById(@PathVariable Long id) {
		return superheroeService.getSuperheroeById(id);
	}
	
	@PostMapping
	public Superheroe createSuperheroe(@RequestBody Superheroe superheroe) {
		return superheroeService.createSuperheroe(superheroe);
	}
	
	@DeleteMapping("/{id}")
	public void deleteSuperheroeById(@PathVariable Long id) {
		superheroeService.deleteSuperheroeById(id);
	}
	
}
