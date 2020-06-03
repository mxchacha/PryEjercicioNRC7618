package com.chacha.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.chacha.ejercicio.models.entities.Alumno;

public interface IAlumno extends CrudRepository<Alumno, Integer>{
	

}
