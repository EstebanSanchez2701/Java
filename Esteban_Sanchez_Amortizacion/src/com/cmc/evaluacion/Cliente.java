package com.cmc.evaluacion;

public class Cliente {
	private String cedula;
	private String nombre;
	private String apellido;

	public Cliente(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;

	}

	// Mostrar Clientes
	public void mostrarCliente() {
		Banco b = new Banco();

		if (b.getClientes() != null) {
			System.out.println("[Cedula: " + cedula + ", Nombre: " + nombre + ", Apellido: " + apellido + " ]");
		} else {
			System.out.println("Cliente ya existe: " + cedula);
		}
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
	 * @return the apellido
	 */
	public final String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public final void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
