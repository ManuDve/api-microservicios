package com.eureka.springboot.app.organizaciones.models.entity;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "organizaciones")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Organizacion implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	@Column(name="es_publico")
    private Boolean publico;
    @Column(name="primera_aparicion")
    private LocalDate fecha;
    
	/**
	 * 
	 */
	private static final long serialVersionUID = -1180282027706171749L;
}
