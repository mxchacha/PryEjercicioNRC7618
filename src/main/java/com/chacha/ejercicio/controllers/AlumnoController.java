package com.chacha.ejercicio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.chacha.ejercicio.models.entities.Alumno;
import com.chacha.ejercicio.services.IAlumnoService;

@Controller
@RequestMapping(value="/alumno")
/* 
 * Todas las peticiones que gestiona este controlador
 * empieza por /alumno, Ejemplo: https://localhost:8080/alumno/create
 */
public class AlumnoController {
	
	  @Autowired
	  private IAlumnoService srvAlumno;
	  
	  
	  //Cada método en el controlador gestiona una petición al backend
	  //a traves de una URL, puede ser:
	  /*1-Escrita en el navegador
	   * Puede ser Hyperlink
	   * Puede ser un action de un Form
	  */
	  
	  @GetMapping(value="/create")
	  public String create(Model model) {
		  Alumno alumno=new Alumno();
		  model.addAttribute("title", "Registro de nuevo alumn@");
		  model.addAttribute("alumno", alumno);/*Similar al ViewBag*/
		  return "alumno/form";/*Ubicación de la vista*/
	  }
	  
	  
	  @GetMapping(value="/retrieve/{id}")
	  /*PathVariable es necesatio pata  que funciones el Integer Id*/
	  public String retrieve(@PathVariable(value="id")Integer id,Model model) {
		  Alumno alumno=srvAlumno.findById(id);
		  model.addAttribute("alumno", alumno);
		  return "alumno/card";
	  }
	  
	  @GetMapping(value="/update/{id}")
	  public String update(@PathVariable(value="id") Integer id,Model model) {
		  Alumno alumno = srvAlumno.findById(id);
		  model.addAttribute("alumno", alumno);
		  model.addAttribute("title", "Actualizando el registro de " + alumno.toString());/*Crear en la Entidad un metodo TpString*/
		  return "alumno/form";
	  }
	  
	  @GetMapping(value="/delete/{id}")
		public String delete(@PathVariable(value="id") Integer id, Model model, 
				RedirectAttributes flash) {
			try {
				this.srvAlumno.delete(id);
				flash.addFlashAttribute("success", "El registro fue eliminado con éxito.");
			}	
			catch(Exception ex) {
				flash.addFlashAttribute("error", "El registro no pudo ser eliminado.");
			}
			return "redirect:/alumno/list";		
		} 
	  
	  @GetMapping(value="/list")
		public String list(Model model) {
			List<Alumno> alumnos = this.srvAlumno.findAll();
			model.addAttribute("alumnos", alumnos);
			model.addAttribute("title", "Listado de alumnos");
			return "alumno/list";		
		}
	  
	  @PostMapping(value="/save")
	  public String save(Alumno alumno,Model model) {
		  this.srvAlumno.save(alumno);
		  return "redirect:/alumno/list";  
	  }

	  
}
