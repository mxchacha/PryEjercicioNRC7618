package com.chacha.ejercicio.models.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="alumnos")
public class Alumno extends Persona implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name="identificador")
	private String idenfificador;
	
	
	/*=====INICIO DE RELACION====*/
	@OneToMany(mappedBy="asignatura",fetch=FetchType.LAZY)//El nombre asignatura es el mismo para la re;lacion en Aula.
	private List<Aula>aulas;
	
	@OneToMany(mappedBy="estudiante", fetch=FetchType.LAZY)
	private List<Matricula>matriculas;
	
	/*====FIN DE RELACION=====*/

	public Alumno() {
		super();
	}
	
	public Alumno(Integer id) {
		super();
		this.setIdpersona(id);
		
	}
	
	

	public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}

	public String getIdenfificador() {
		return idenfificador;
	}

	public void setIdenfificador(String idenfificador) {
		this.idenfificador = idenfificador;
	}

	public List<Aula> getAulas() {
		return aulas;
	}

	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}

	
	@Override
	public String toString() {
		return this.getApellido()+ " "+ this.getNombre();
	}
	
	
	
	
	
	
	

}
