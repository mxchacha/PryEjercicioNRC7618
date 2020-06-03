package com.chacha.ejercicio.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chacha.ejercicio.models.dao.IAlumno;
import com.chacha.ejercicio.models.dao.IArea;
import com.chacha.ejercicio.models.entities.Alumno;
import com.chacha.ejercicio.models.entities.Area;

@Service
public class AreaService implements IAreaService {

	@Autowired //Inyeccion de dependencia, para instanciar
	private IArea dao;//La dao interactua con la base de datos
	
	@Override
	@Transactional
	public void save(Area area) {
		dao.save(area);
	}

	@Override
	@Transactional
	public Area findById(Integer id) {
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
	public List<Area> findAll() {
		// TODO Auto-generated method stub
		return (List<Area>) dao.findAll();
	}

}
