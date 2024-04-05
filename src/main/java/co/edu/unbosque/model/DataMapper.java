package co.edu.unbosque.model;

import java.util.ArrayList;

public class DataMapper {
	
	public static EstudianteDTO EstudianteToDTO(Estudiante estudiante) {
		return new EstudianteDTO(estudiante.getNombre(), estudiante.getCedula(), estudiante.getPrograma(), estudiante.getFechaIngreso(), estudiante.getCorreo());
	}
	
	public static Estudiante DTOToEstudiante(EstudianteDTO dto) {
		return new Estudiante(dto.getNombre(), dto.getCedula(), dto.getPrograma(), dto.getFechaIngreso(), dto.getCorreo());
	}
	
	public static ArrayList<Estudiante> ArrayDTOsToEstudiantes(ArrayList<EstudianteDTO> dtos) {
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		for(EstudianteDTO dto : dtos) {
			estudiantes.add(DataMapper.DTOToEstudiante(dto));
		}
		return estudiantes;
	}
	
	public static ArrayList<EstudianteDTO> ArrayEstudiantesToDTOs(ArrayList<Estudiante> estudiantes) {
		ArrayList<EstudianteDTO> dtos = new ArrayList<EstudianteDTO>();
		for(Estudiante estudiante : estudiantes) {
			dtos.add(DataMapper.EstudianteToDTO(estudiante));
		}
		return dtos;
	}

}
