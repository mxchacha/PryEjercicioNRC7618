package com.chacha.ejercicio.services;

import java.util.List;


import com.chacha.ejercicio.models.entities.Aula;

public interface IAulaService {
	
	public void save(Aula aula);
	public Aula findById(Integer id);
	public void delete(Integer id);
	public List<Aula> findAll();

}
