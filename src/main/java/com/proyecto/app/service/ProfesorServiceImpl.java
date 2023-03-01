package com.proyecto.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.proyecto.app.model.Profesor;
import com.proyecto.app.repository.ProfesorRepository;

@Service
public class ProfesorServiceImpl extends GenericServiceImpl<Profesor, Long> implements ProfesorSevice {
	
	@Autowired
	ProfesorRepository profesorRepository;
	
	@Override
	public CrudRepository<Profesor, Long> getDao() {
		// TODO Auto-generated method stub
		return profesorRepository;
	}

}
