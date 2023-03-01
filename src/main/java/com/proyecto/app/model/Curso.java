package com.proyecto.app.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Curso")
@Data
public class Curso {
	private Long id_curso;
	private String nombre;
	private int nivel;
	private String descripcion;
	
}
