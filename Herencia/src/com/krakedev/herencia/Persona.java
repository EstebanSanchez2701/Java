package com.krakedev.herencia;

public class Persona {
	private String nombre;
	private String cedula;

	public Persona(String nombre, String cedula) {
		this.nombre = nombre;
		this.cedula = cedula;
	}



	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", cedula=" + cedula + "]";
	}



	/**
	 * @return the nombre
	 */
	public final String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public final void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the cedula
	 */
	public final String getCedula() {
		return cedula;
	}

	/**
	 * @param cedula the cedula to set
	 */
	public final void setCedula(String cedula) {
		this.cedula = cedula;
	}

}
