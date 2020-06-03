package com.chacha.ejercicio.models.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity; /* javax.peristence es el ORM =/ JPA */
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/*Code First que es  primero codificar los modelos
y a partir de ahí generar la base de datos*/

@Entity /*Hace que la clase se transforme en un modelo indentidad*/
@Table(name="materias")
public class Materia implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*Serializable: Permite viajar a traves de la red convirtiendolo en bytes*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="pk_materia")
	private Integer idmateria;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="nrc")
	private String nrc;
	
	@Column(name="creditos")
	private Integer creditos;
	
	
/*RELACIONES ENTRE  ENTIDADES UNO A VARIOS CON AREA */
	

	@JoinColumn(name="fk_area",referencedColumnName="pk_area")
	@ManyToOne
	private Area area;
	
	
	@OneToMany(mappedBy="asignatura",fetch=FetchType.LAZY)//El nombre asignatura es el mismo para la re;lacion en Aula.
	private List<Aula>aulas;

	@JoinColumn(name="fk_semestre",referencedColumnName="pk_semestre")
	@ManyToOne
	private Semestre semestre;

	@OneToMany(mappedBy="curso",fetch=FetchType.LAZY)//El nombre asignatura es el mismo para la re;lacion en Aula.
	private List<Matricula>matriculas;
	
	/*FIN DE RELACION*/
	
	public Materia() {
		super();
	}
	
	public Materia(Integer id) {
		super();
		this.idmateria=id;
	}
	
	
	
	public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
	
	
	public List<Aula> getAulas() {
		return aulas;
	}

	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}

	public Semestre getSemestre() {
		return semestre;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}
	

	public Integer getIdmateria() {
		return idmateria;
	}

	public void setIdmateria(Integer idmateria) {
		this.idmateria = idmateria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNrc() {
		return nrc;
	}

	public void setNrc(String nrc) {
		this.nrc = nrc;
	}

	public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}
	
	
	
	


	
	

}
