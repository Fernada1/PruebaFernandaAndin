package com.proyecto.app.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Document(collection = "Profesor")
@Data
public class Profesor {
	
	@Id
	private Long id_prof;
	private String nombre;
	private String direccion;
	private int telefono;
	public Long getId_prof() {
		return id_prof;
	}
	public void setId_prof(Long id_prof) {
		this.id_prof = id_prof;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public List<Curso> getListCurso() {
		return listCurso;
	}
	public void setListCurso(List<Curso> listCurso) {
		this.listCurso = listCurso;
	}
	

	public Departamento getDeptor() {
		return deptor;
	}
	public void setDeptor(Departamento deptor) {
		this.deptor = deptor;
	}
	public List getListadedepto() {
		return listadedepto;
	}
	public void setListadedepto(List listadedepto) {
		this.listadedepto = listadedepto;
	}

	//relaciones

	private Departamento deptor; //One to one 
	private List listadedepto;

	private Curso curso;
	private List<Curso>listCurso;
	
	
}
