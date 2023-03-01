package com.proyecto.app.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Departamento")
@Data
public class Departamento {
	private Long id_depar;
	private String nombre;
	private String director;
	private String descripcion;
}
