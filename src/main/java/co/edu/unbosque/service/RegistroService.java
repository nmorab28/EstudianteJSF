package co.edu.unbosque.service;

import java.util.ArrayList;

import co.edu.unbosque.model.DataMapper;
import co.edu.unbosque.model.Estudiante;
import co.edu.unbosque.model.EstudianteDTO;
import co.edu.unbosque.model.exception.RepetidoException;
import co.edu.unbosque.model.persistence.EstudianteDAO;
import co.edu.unbosque.model.persistence.EstudianteDAOImpl;

public class RegistroService {
	
	private EstudianteDAO<Estudiante, String> dao;
	
	public RegistroService() {
		dao = new EstudianteDAOImpl();
	}
	
	public EstudianteDTO registarEstudiante(EstudianteDTO estudiante) throws RepetidoException {
		System.out.println("Estudiante a registar en el servicio: " + estudiante.getCedula());
		return DataMapper.EstudianteToDTO(dao.crear(DataMapper.DTOToEstudiante(estudiante))); 
	}
	
	public ArrayList<EstudianteDTO> consultarEstudiantes() {
		return DataMapper.ArrayEstudiantesToDTOs(dao.buscarTodos());
	}

}
