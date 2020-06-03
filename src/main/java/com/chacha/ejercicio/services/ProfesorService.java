package com.chacha.ejercicio.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chacha.ejercicio.models.dao.IProfesor;
import com.chacha.ejercicio.models.entities.Alumno;
import com.chacha.ejercicio.models.entities.Profesor;

@Service
public class ProfesorService implements IProfesorService {

	@Autowired
	private IProfesor dao;
	
	@Override
	@Transactional
	public void save(Profesor profesor) {
		dao.save(profesor);
		
	}

	@Override
	@Transactional
	public Profesor findById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	@Transactional
	public List<Profesor> findAll() {
		// TODO Auto-generated method stub
		return (List<Profesor>) dao.findAll();
	}

}
