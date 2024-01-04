package com.nicosandoval.pruebasanotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.nicosandoval.pruebasanotations")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {
	
	// definir el Bean para 'informe financiero departamento compras'
	
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() { // sera el ID del Bean inyectado
		
		return new InformeFinancieroDptoCompras();
		
	}
	// definir el Bean para directorfinanciero e inyectar dependencias

	@Bean
	public Empleados directorFinanciero() { // será el ID de Bean llamado
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}
}
