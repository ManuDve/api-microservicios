package com.eureka.springboot.app.estadisticasorg.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estadistica {
	private Organizacion organizacion;
	private Integer vigentes;
}
