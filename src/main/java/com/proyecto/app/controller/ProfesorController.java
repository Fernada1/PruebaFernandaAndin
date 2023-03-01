package com.proyecto.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import com.proyecto.app.model.Profesor;
import com.proyecto.app.service.ProfesorSevice;

@RestController
@RequestMapping("/api/profesor")
public class ProfesorController {
	
	@Autowired
	ProfesorSevice profesorService;
	
	@GetMapping("/listar")
    public ResponseEntity<List<Profesor>> listarProductos() {
        return new ResponseEntity<>(profesorService.findByAll(), 
                HttpStatus.OK);
    }
    @PostMapping("/crear")
    public ResponseEntity<Profesor> crearProducto(
            @RequestBody Profesor p) {
        return new ResponseEntity<>(profesorService.save(p), 
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Profesor> actualizarProducto(@PathVariable Long id, @RequestBody Profesor p) {
    	Profesor profesorENcontrada = profesorService.findById(id);
        if (profesorENcontrada == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
            	profesorENcontrada.setNombre(p.getNombre());
            	profesorENcontrada.setDireccion(p.getDireccion());
            	profesorENcontrada.setTelefono(p.getTelefono());
                return new ResponseEntity<>(profesorService.save(p), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Profesor> eliminarProfesor(@PathVariable Long id) {
    	profesorService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
