package com.krakedev.persistencia.entidades;

public class EstadoCivil {
	private String codigo;
	private String descripcion;
	
	
	public EstadoCivil(String codigo, String descripcion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	
	
	@Override
	public String toString() {
		return "EstadoCivil [codigo=" + codigo + ", descripcion=" + descripcion + "]";
	}



	/**
	 * @return the codigo
	 */
	public final String getCodigo() {
		return codigo;
	}


	/**
	 * @param codigo the codigo to set
	 */
	public final void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	/**
	 * @return the descripcion
	 */
	public final String getDescripcion() {
		return descripcion;
	}


	/**
	 * @param descripcion the descripcion to set
	 */
	public final void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
