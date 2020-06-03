package com.chacha.ejercicio.services;

import java.util.List;

import com.chacha.ejercicio.models.entities.Semestre;

public interface ISemestreService {
	public void save(Semestre semestre);
	public Semestre findById(Integer id);
	public void delete(Integer id);
	public List<Semestre> findAll();

}
