package com.chacha.ejercicio.models.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="areas")
public class Area implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/*Serializable: Permite viajar a traves de la red convirtiendolo en bytes*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="pk_area")
	private Integer idarea;
	
	@Column(name="nombre")
	private String nombre;
	
	
	
	/*RELACIONES ENTRE  ENTIDADES UNO A VARIOS CON MATERIA */
	

	
	@OneToMany(mappedBy="area",fetch=FetchType.LAZY)//MappedBy debe ser un atributo en la clase relacionada
 	private List<Materia> materias; 

	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

	
	
	/*FIN DE RELACION*/

	public Area() {
		super();
	}
	
	public Area(Integer idarea) {
		super();
		this.idarea=idarea;
	}

	public Integer getIdarea() {
		return idarea;
	}

	public void setIdarea(Integer idarea) {
		this.idarea = idarea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	

}
