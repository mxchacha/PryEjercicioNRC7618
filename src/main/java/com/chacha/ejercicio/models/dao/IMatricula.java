package com.chacha.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.chacha.ejercicio.models.entities.Matricula;



public interface IMatricula extends CrudRepository<Matricula, Integer> {

}
