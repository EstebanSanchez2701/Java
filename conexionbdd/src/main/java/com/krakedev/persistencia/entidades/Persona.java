package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Persona {
	private String cedula;
	private String nombre;
	private String apellido;
	private EstadoCivil estadoCivil;
	private int numeroHijos;
	private double estatura;
	private BigDecimal cantidadAhorrada;
	private Date fechaNacimiento;
	private Date horaNacimiento;
	
	public Persona() {
		
	}
	
	public Persona(String cedula, String nombre, String apellido, EstadoCivil estadoCivil, int numeroHijos,
			double estatura, BigDecimal cantidadAhorrada, Date fechaNacimiento, Date horaNacimiento) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estadoCivil = estadoCivil;
		this.numeroHijos = numeroHijos;
		this.estatura = estatura;
		this.cantidadAhorrada = cantidadAhorrada;
		this.fechaNacimiento = fechaNacimiento;
		this.horaNacimiento = horaNacimiento;
	}
	public Persona(String cedula, String nombre, String apellido, Date fechaNacimiento) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", estadoCivil="
				+ estadoCivil + ", numeroHijos=" + numeroHijos + ", estatura=" + estatura + ", cantidadAhorrada="
				+ cantidadAhorrada + ", fechaNacimiento=" + fechaNacimiento + ", horaNacimiento=" + horaNacimiento
				+ "]";
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
	/**
	 * @return the estadoCivil
	 */
	public final EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	/**
	 * @param estadoCivil the estadoCivil to set
	 */
	public final void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	/**
	 * @return the numeroHijos
	 */
	public final int getNumeroHijos() {
		return numeroHijos;
	}
	/**
	 * @param numeroHijos the numeroHijos to set
	 */
	public final void setNumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}
	/**
	 * @return the estatura
	 */
	public final double getEstatura() {
		return estatura;
	}
	/**
	 * @param estatura the estatura to set
	 */
	public final void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	/**
	 * @return the cantidadAhorrada
	 */
	public final BigDecimal getCantidadAhorrada() {
		return cantidadAhorrada;
	}
	/**
	 * @param cantidadAhorrada the cantidadAhorrada to set
	 */
	public final void setCantidadAhorrada(BigDecimal cantidadAhorrada) {
		this.cantidadAhorrada = cantidadAhorrada;
	}
	/**
	 * @return the fechaNacimiento
	 */
	public final Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public final void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	/**
	 * @return the horaNacimiento
	 */
	public final Date getHoraNacimiento() {
		return horaNacimiento;
	}
	/**
	 * @param horaNacimiento the horaNacimiento to set
	 */
	public final void setHoraNacimiento(Date horaNacimiento) {
		this.horaNacimiento = horaNacimiento;
	}
	
	
}
