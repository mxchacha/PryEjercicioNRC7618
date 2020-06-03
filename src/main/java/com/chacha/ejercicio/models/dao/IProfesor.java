package com.chacha.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;


import com.chacha.ejercicio.models.entities.Profesor;

public interface IProfesor extends CrudRepository<Profesor, Integer>{

}
