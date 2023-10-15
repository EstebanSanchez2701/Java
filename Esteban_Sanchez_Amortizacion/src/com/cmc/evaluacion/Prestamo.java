package com.cmc.evaluacion;

import java.util.ArrayList;

public class Prestamo {
	private double monto;
	private double intereses;
	private int plazo;
	private ArrayList<Cuota> cuotas;

	// Constructor
	public Prestamo(double monto, double intereses, int plazo) {
		this.monto = monto;
		this.intereses = intereses;
		this.plazo = plazo;
		this.cuotas = new ArrayList<Cuota>();
	}

	public void mostrarPrestamo() {
		Banco b = new Banco();
		if (b.getPrestamos() != null) {
			System.out.println("[Monto: " + monto + ", Interes: " + intereses + ", Plazo: " + plazo + " ]");
		}
	}

	// Getters y Setters
	/**
	 * @return the monto
	 */
	public final double getMonto() {
		return monto;
	}

	/**
	 * @param monto the monto to set
	 */
	public final void setMonto(double monto) {
		this.monto = monto;
	}

	/**
	 * @return the intereses
	 */
	public final double getIntereses() {
		return intereses;
	}

	/**
	 * @param intereses the intereses to set
	 */
	public final void setIntereses(double intereses) {
		this.intereses = intereses;
	}

	/**
	 * @return the plazo
	 */
	public final int getPlazo() {
		return plazo;
	}

	/**
	 * @param plazo the plazo to set
	 */
	public final void setPlazo(int plazo) {
		this.plazo = plazo;
	}

	/**
	 * @return the cuotas
	 */
	public final ArrayList<Cuota> getCuotas() {
		return cuotas;
	}

}
