package com.cmc.directorio.entidades;

public class Telefono {
	private String operadora;
	private String numero;
	private int codigo;
	private boolean tieneWhatsapp;

	// cosntructor
	public Telefono(int codigo, String operadora, String numero) {
		this.codigo = codigo;
		this.operadora = operadora;
		this.numero = numero;
		this.tieneWhatsapp = false;
	}
	
	//getters and setters
	/**
	 * @return the operadora
	 */
	public String getOperadora() {
		return operadora;
	}

	/**
	 * @param operadora the operadora to set
	 */
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the tieneWhatsapp
	 */
	public boolean isTieneWhatsapp() {
		return tieneWhatsapp;
	}

	/**
	 * @param tieneWhatsapp the tieneWhatsapp to set
	 */
	public void setTieneWhatsapp(boolean tieneWhatsapp) {
		this.tieneWhatsapp = tieneWhatsapp;
	}

}
