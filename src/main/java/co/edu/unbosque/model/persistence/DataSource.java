package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Estudiante;
import co.edu.unbosque.model.exception.InexistenteException;
import co.edu.unbosque.model.exception.RepetidoException;

public class DataSource {
	
	private static ArrayList<Estudiante> estudiantes;
	
	static {
		estudiantes = new ArrayList<Estudiante>();
	}
	
	public static Estudiante crearEstudiante(Estudiante estudiante) throws RepetidoException{
		if(!estudiantes.contains(estudiante)) {
			estudiantes.add(estudiante);
			return estudiante;
		}
		
		throw new RepetidoException("ERROR | El estudiante esta repetido");
	}
	
	public static ArrayList<Estudiante> consultarEstudiantes(){
		return estudiantes;
	}
	
	public static Estudiante consultarEstudiante(String cedula) throws InexistenteException{
		for(Estudiante estudiante : estudiantes) {
			if(estudiante.equals(cedula))
				return estudiante;
		}
		
		throw new InexistenteException("ERROR | El estudiante no fue encontrado");
		
	}

}
