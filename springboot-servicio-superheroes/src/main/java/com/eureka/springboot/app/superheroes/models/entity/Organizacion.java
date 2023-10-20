package com.eureka.springboot.app.superheroes.models.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "organizaciones_en_superheroes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Organizacion {
	@Id
	private Long id;
	private String nombre;
    private Boolean publico;
    private LocalDate fecha;
}
