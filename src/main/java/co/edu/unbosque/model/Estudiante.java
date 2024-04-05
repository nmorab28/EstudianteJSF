package co.edu.unbosque.model;

import java.time.LocalDate;

public class Estudiante {
	
	private String nombre;
	private String cedula;
	private String programa;
	private LocalDate fechaIngreso;
	private String correo;
	
	public Estudiante(String nombre, String cedula, String programa, LocalDate fechaIngreso, String correo) {
		this.nombre = nombre;
		this.cedula = cedula;
		this.programa = programa;
		this.fechaIngreso = fechaIngreso;
		this.correo = correo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}

	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	/**
	 * @return the programa
	 */
	public String getPrograma() {
		return programa;
	}

	/**
	 * @param programa the programa to set
	 */
	public void setPrograma(String programa) {
		this.programa = programa;
	}

	/**
	 * @return the fechaIngreso
	 */
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public boolean equals(Object obj) {
		return ((Estudiante) obj).getCedula().equals(getCedula());
	}
}
