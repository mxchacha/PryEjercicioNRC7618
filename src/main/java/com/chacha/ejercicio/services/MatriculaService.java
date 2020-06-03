package com.chacha.ejercicio.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chacha.ejercicio.models.dao.IAlumno;
import com.chacha.ejercicio.models.dao.IMatricula;
import com.chacha.ejercicio.models.entities.Alumno;
import com.chacha.ejercicio.models.entities.Matricula;

@Service
public class MatriculaService implements IMatriculaService{
	
	@Autowired //Inyeccion de dependencia, para instanciar
	private IMatricula dao;//La dao interactua con la base de datos

	@Override
	@Transactional
	public void save(Matricula matricula) {
		dao.save(matricula);
		
	}

	@Override
	@Transactional
	public Matricula findById(Integer id) {
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
	public List<Matricula> findAll() {
		// TODO Auto-generated method stub
		return (List<Matricula>) dao.findAll();
	}

}
