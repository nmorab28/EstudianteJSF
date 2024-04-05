package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Estudiante;
import co.edu.unbosque.model.exception.InexistenteException;
import co.edu.unbosque.model.exception.RepetidoException;

public class EstudianteDAOImpl implements EstudianteDAO<Estudiante, String>{

	@Override
	public Estudiante crear(Estudiante entidad) throws RepetidoException {
		return DataSource.crearEstudiante(entidad);
	}

	@Override
	public Estudiante buscar(String id) throws InexistenteException {
		return DataSource.consultarEstudiante(id);
	}

	@Override
	public ArrayList<Estudiante> buscarTodos() {
		return DataSource.consultarEstudiantes();
	}
	
	

}
