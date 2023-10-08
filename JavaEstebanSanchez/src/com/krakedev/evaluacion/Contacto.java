package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;

	// CONSTRUCTOR
	public Contacto(String cedula, String nombre, String apellido, Direccion direccion) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefonos = new ArrayList<Telefono>();
	}

	public void imprimir() {
		System.out.println("Información del Contacto");
		System.out.println("Cédula: " + cedula);
		System.out.println("Nombre:" + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Dirección:");
		System.out.println("Calle Principal: " + direccion.getCallePrincipal());
		System.out.println("Calle Secundaria: " + direccion.getCalleSecundaria());
	}

	public void imprimir2() {
		System.out.println("***" + nombre + " " + apellido + "***");
		System.out.println("Dirección:" + direccion.getCallePrincipal() + " y " + direccion.getCalleSecundaria());
	}

	public void agregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}

	public void mostrarTelefonos() {
		Telefono elementoTelefono;
		System.out.println("Teléfonos con estado 'C':");
		for (int i = 0; i < telefonos.size(); i++) {
			elementoTelefono = telefonos.get(i);
			if (elementoTelefono != null && elementoTelefono.getEstado().equalsIgnoreCase("C")) {
				System.out.println("Número: " + elementoTelefono.getNumero() + " Tipo: " + elementoTelefono.getTipo());
			}
		}
	}
	
	public ArrayList<Telefono> recuperarIncorrectos() {
		ArrayList<Telefono> telefonoError = new ArrayList<Telefono>();
		Telefono elementoTelefono;
		for (int i = 0; i < telefonos.size(); i++) {
			elementoTelefono = telefonos.get(i);
			if (elementoTelefono != null && elementoTelefono.getEstado().equalsIgnoreCase("E")) {
				telefonoError.add(elementoTelefono);
			}
		}
		return telefonoError;
	}

	// GETTERS AND SETTERS
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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the direccion
	 */
	public Direccion getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the telefonos
	 */
	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	/**
	 * @param telefonos the telefonos to set
	 */
	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
}
