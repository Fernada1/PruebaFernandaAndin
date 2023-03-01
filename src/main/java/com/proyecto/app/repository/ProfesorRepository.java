package com.proyecto.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.proyecto.app.model.Profesor;

public interface ProfesorRepository extends MongoRepository<Profesor, Long>{

}
