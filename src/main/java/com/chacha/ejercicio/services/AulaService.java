package com.chacha.ejercicio.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chacha.ejercicio.models.dao.IAlumno;
import com.chacha.ejercicio.models.dao.IAula;
import com.chacha.ejercicio.models.entities.Alumno;
import com.chacha.ejercicio.models.entities.Aula;

@Service
public class AulaService implements IAulaService {

	@Autowired //Inyeccion de dependencia, para instanciar
	private IAula dao;//La dao interactua con la base de datos
	
	@Override
	@Transactional
	public void save(Aula aula) {
		dao.save(aula);
		
	}

	@Override
	@Transactional
	public Aula findById(Integer id) {
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
	public List<Aula> findAll() {
		// TODO Auto-generated method stub
		return (List<Aula>) dao.findAll();
	}

}
