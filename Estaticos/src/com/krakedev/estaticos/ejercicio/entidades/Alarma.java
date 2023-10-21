package com.krakedev.estaticos.ejercicio.entidades;

import com.krakedev.estaticos.ejercicio.utils.Util;

public class Alarma {
	private int dia;
	private int hora;
	private int minuto;

	// Constructor
	public Alarma(int dia, int hora, int minuto) {
		super();
		this.dia = dia;
		this.hora = hora;
		this.minuto = minuto;
	}

	@Override
	public String toString() {

		return Util.formatearDia(dia) + ", " + Util.formatearHora(hora) + ":" + Util.formatearHora(minuto);
	}

	// getters and setters
	/**
	 * @return the dia
	 */
	public final int getDia() {
		return dia;
	}

	/**
	 * @param dia the dia to set
	 */
	public final void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * @return the hora
	 */
	public final int getHora() {
		return hora;
	}

	/**
	 * @param hora the hora to set
	 */
	public final void setHora(int hora) {
		this.hora = hora;
	}

	/**
	 * @return the minuto
	 */
	public final int getMinuto() {
		return minuto;
	}

	/**
	 * @param minuto the minuto to set
	 */
	public final void setMinuto(int minuto) {
		this.minuto = minuto;
	}

}
