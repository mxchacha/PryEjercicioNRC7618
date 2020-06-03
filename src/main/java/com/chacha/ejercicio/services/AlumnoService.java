package com.chacha.ejercicio.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chacha.ejercicio.models.dao.IAlumno;
import com.chacha.ejercicio.models.entities.Alumno;

@Service
public class AlumnoService implements IAlumnoService {

	@Autowired //Inyeccion de dependencia, para instanciar
	private IAlumno dao;//La dao interactua con la base de datos
	
	@Override
	@Transactional
	public void save(Alumno alumno) {
		dao.save(alumno);
		
	}

	@Override
	@Transactional
	public Alumno findById(Integer id) {
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
	public List<Alumno> findAll() {
		// TODO Auto-generated method stub
		return (List<Alumno>) dao.findAll();
	}

}
