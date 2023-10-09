package com.eureka.springboot.app.estadisticasorg.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Organizacion {
	private Long id;
	private String nombre;
    private Boolean publico;
    private LocalDate fecha;
}
