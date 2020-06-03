package com.chacha.ejercicio.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chacha.ejercicio.models.dao.ISemestre;
import com.chacha.ejercicio.models.entities.Alumno;
import com.chacha.ejercicio.models.entities.Semestre;

@Service
public class SemestreService implements ISemestreService {

	
	@Autowired
	private ISemestre dao;
	
	
	@Override
	@Transactional
	public void save(Semestre semestre) {
		dao.save(semestre);
		
	}

	@Override
	@Transactional
	public Semestre findById(Integer id) {
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
	public List<Semestre> findAll() {
		// TODO Auto-generated method stub
		return (List<Semestre>) dao.findAll();
	}

}
