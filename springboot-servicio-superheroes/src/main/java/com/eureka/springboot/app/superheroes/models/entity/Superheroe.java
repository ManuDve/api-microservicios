package com.eureka.springboot.app.superheroes.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "superheroes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Superheroe{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String alias;
	@Column(name = "esta_activo")
	private Boolean vigencia;
	@ManyToOne
    @JoinColumn(name = "organizacion_id")
    private Organizacion organizacion;
}
