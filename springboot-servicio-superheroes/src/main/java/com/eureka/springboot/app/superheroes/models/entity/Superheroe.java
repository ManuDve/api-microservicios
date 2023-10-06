package com.eureka.springboot.app.superheroes.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "superheroes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Superheroe implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String alias;
	/**
	 * 
	 */
	private static final long serialVersionUID = -1980943800804667633L;
}
