package com.chacha.ejercicio.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chacha.ejercicio.models.dao.IAlumno;
import com.chacha.ejercicio.models.dao.IMateria;
import com.chacha.ejercicio.models.entities.Alumno;
import com.chacha.ejercicio.models.entities.Materia;

@Service
public class MateriaService implements IMateriaService {

	
	@Autowired //Inyeccion de dependencia, para instanciar
	private IMateria dao;//La dao interactua con la base de datos
	
	
	@Override
	@Transactional
	public void save(Materia materia) {
		dao.save(materia);
		
	}

	@Override
	@Transactional
	public Materia findById(Integer id) {
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
	public List<Materia> findAll() {
		// TODO Auto-generated method stub
		return (List<Materia>) dao.findAll();
	}

}
