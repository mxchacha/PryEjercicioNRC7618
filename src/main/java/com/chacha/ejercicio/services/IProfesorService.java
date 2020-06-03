package com.chacha.ejercicio.services;

import java.util.List;

import com.chacha.ejercicio.models.entities.Profesor;

public interface IProfesorService {

	public void save(Profesor profesor);
	public Profesor findById(Integer id);
	public void delete(Integer id);
	public List<Profesor> findAll();
}
