package com.eureka.springboot.app.superheroes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.springboot.app.superheroes.clientes.OrganizacionClienteRest;
import com.eureka.springboot.app.superheroes.models.entity.Organizacion;
import com.eureka.springboot.app.superheroes.models.entity.Superheroe;
import com.eureka.springboot.app.superheroes.models.service.ISuperheroeService;
import com.eureka.springboot.app.superheroes.models.service.OrganizacionService;

@RestController
public class SuperheroeController {

	@Autowired
	private ISuperheroeService superheroeService;
	
	@Autowired
	private OrganizacionClienteRest clienteRest;
	
	@Autowired
	private OrganizacionService organizacionService;
	
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
		Long idPostBody = superheroe.getOrganizacion().getId();
		Organizacion nuevaOrganizacion = organizacionService.createOrganizacion(clienteRest.getOrganizacionById(idPostBody));
		superheroe.setOrganizacion(nuevaOrganizacion);
		// superheroe.setOrganizacion(clienteRest.getOrganizacionById(superheroe.getOrganizacion().getId()));
		return superheroeService.createSuperheroe(superheroe);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteSuperheroeById(@PathVariable Long id) {
		//Elimina primero la organizacion que esta contenida dentro del superheroe
		Long idOrganizacion = superheroeService.getSuperheroeById(id).getOrganizacion().getId();
		String nombreDelEliminado = superheroeService.getSuperheroeById(id).getAlias();
		superheroeService.deleteSuperheroeById(id);
		organizacionService.deleteOrganizacionById(idOrganizacion);
		// return ResponseEntity.ok("Se ha eliminado el supeheroe y la organizacion de ID:" + idOrganizacion);
		return ResponseEntity.ok("Se ha eliminado el supehéroe llamado " + nombreDelEliminado);
	}
	
}
