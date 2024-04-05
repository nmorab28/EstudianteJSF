package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.exception.InexistenteException;
import co.edu.unbosque.model.exception.RepetidoException;

public interface EstudianteDAO<T, K> {
	
	T crear(T entidad) throws RepetidoException;
	
	T buscar(K id) throws InexistenteException;
	
	ArrayList<T> buscarTodos();

}
