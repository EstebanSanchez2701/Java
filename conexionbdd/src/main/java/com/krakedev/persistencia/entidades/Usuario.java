package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;

public class Usuario {
	private String cedula;
	private String nombre;
	private String apellido;
	private String tipoCuenta;
	private BigDecimal limiteCredito;
	
	
	
	public Usuario(String cedula) {
		super();
		this.cedula = cedula;
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
	 * @return the tipoCuenta
	 */
	public final String getTipoCuenta() {
		return tipoCuenta;
	}
	/**
	 * @param tipoCuenta the tipoCuenta to set
	 */
	public final void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	/**
	 * @return the limiteCredito
	 */
	public final BigDecimal getLimiteCredito() {
		return limiteCredito;
	}
	/**
	 * @param limiteCredito the limiteCredito to set
	 */
	public final void setLimiteCredito(BigDecimal limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	
}
