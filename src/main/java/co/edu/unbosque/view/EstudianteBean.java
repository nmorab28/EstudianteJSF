package co.edu.unbosque.view;

import java.io.Serializable;
import java.util.ArrayList;

import co.edu.unbosque.model.EstudianteDTO;
import co.edu.unbosque.model.exception.RepetidoException;
import co.edu.unbosque.service.RegistroService;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named(value = "estudianteBean")
@ApplicationScoped
public class EstudianteBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EstudianteDTO estudiante;
	private RegistroService registroService;
	private ArrayList<EstudianteDTO> estudiantesRegistrados;
	
	@PostConstruct
	public void init() {
		estudiante = new EstudianteDTO();
		registroService = new RegistroService();
		
	}
	
	public String registrar() {
		System.out.println("Esta es la cedula registarda: " + estudiante.getCedula());
		System.out.println("Estudiante en el bean: " + estudiante.toString());
		try {
			registroService.registarEstudiante(estudiante);
			estudiantesRegistrados = registroService.consultarEstudiantes();
			System.out.println("-------------------Estudiantes Registrados-------------------");
			for(EstudianteDTO aux : estudiantesRegistrados) {
				System.out.println(aux.toString());
			}
			
		} catch (RepetidoException e) {
			System.out.println("ERROR | No se pudo registrar el estudiante");
		}
		
		return "estudiantesRegistrados.xhtml";
	}

	/**
	 * @return the estudiante
	 */
	public EstudianteDTO getEstudiante() {
		return estudiante;
	}

	/**
	 * @param estudiante the estudiante to set
	 */
	public void setEstudiante(EstudianteDTO estudiante) {
		this.estudiante = estudiante;
	}

	/**
	 * @return the registroService
	 */
	public RegistroService getRegistroService() {
		return registroService;
	}

	/**
	 * @param registroService the registroService to set
	 */
	public void setRegistroService(RegistroService registroService) {
		this.registroService = registroService;
	}

	/**
	 * @return the estudiantesRegistrados
	 */
	public ArrayList<EstudianteDTO> getEstudiantesRegistrados() {
		return estudiantesRegistrados;
	}

	/**
	 * @param estudiantesRegistrados the estudiantesRegistrados to set
	 */
	public void setEstudiantesRegistrados(ArrayList<EstudianteDTO> estudiantesRegistrados) {
		this.estudiantesRegistrados = estudiantesRegistrados;
	}
}
