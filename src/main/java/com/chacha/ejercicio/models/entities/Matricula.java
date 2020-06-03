package com.chacha.ejercicio.models.entities;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="matriculas")
public class Matricula implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/*Serializable: Permite viajar a traves de la red convirtiendolo en bytes*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="pk_matricula")
	private Integer idmatricula;
	
	@Column(name="fecha")
	private Calendar fecha;
	
	@Column(name="costo")
	private Float costo;
	
	@Column(name="tipo")
	private String tipo;

	
	/*====REALACION=====*/
	@JoinColumn(name="fk_estudiante",referencedColumnName="pk_persona")
	@ManyToOne
	private Alumno estudiante;
	
	@JoinColumn(name="fk_curso",referencedColumnName="pk_materia")
	@ManyToOne
	private Materia curso;
	
	
	
	/*====FIN RELACION====*/
	public Matricula() {
		super();
	}
	
	public Matricula(Integer id) {
		super();
		this.idmatricula=id;
	}

	
	public Alumno getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Alumno estudiante) {
		this.estudiante = estudiante;
	}

	public Materia getCurso() {
		return curso;
	}

	public void setCurso(Materia curso) {
		this.curso = curso;
	}

	public Integer getIdmatricula() {
		return idmatricula;
	}

	public void setIdmatricula(Integer idmatricula) {
		this.idmatricula = idmatricula;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public Float getCosto() {
		return costo;
	}

	public void setCosto(Float costo) {
		this.costo = costo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	
	
	
	

}
