package com.krakedev.entidades;

public class Carta {
	private Numero numero;
	private String palo;
	private String estado;
	
	//Constructor
	public Carta(Numero numero, String palo) {
		this.numero = numero;
		this.palo = palo;
		this.estado = "N";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String cadena = numero.getNumeroCarta()+"-"+palo;
		return cadena;
	}
	
	// Getters and setters
	/**
	 * @return the numero
	 */
	public Numero getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Numero numero) {
		this.numero = numero;
	}

	/**
	 * @return the palo
	 */
	public String getPalo() {
		return palo;
	}

	/**
	 * @param palo the palo to set
	 */
	public void setPalo(String palo) {
		this.palo = palo;
	}

	/**
	 * @return the estado
	 */
	public final String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public final void setEstado(String estado) {
		this.estado = estado;
	}

}
