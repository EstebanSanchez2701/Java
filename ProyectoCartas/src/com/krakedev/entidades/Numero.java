package com.krakedev.entidades;

public class Numero {
	private String numeroCarta;
	private int valor;

	// Constructor
	public Numero(String numeroCarta, int valor) {
		this.numeroCarta = numeroCarta;
		this.valor = valor;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String cadena = numeroCarta + "-" + String.valueOf(valor);
		return cadena;
	}

	// Getters and Setters
	/**
	 * @return the numeroCarta
	 */
	public String getNumeroCarta() {
		return numeroCarta;
	}

	/**
	 * @param numeroCarta the numeroCarta to set
	 */
	public void setNumeroCarta(String numeroCarta) {
		this.numeroCarta = numeroCarta;
	}

	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

}
