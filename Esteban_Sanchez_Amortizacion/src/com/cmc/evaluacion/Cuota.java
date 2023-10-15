package com.cmc.evaluacion;

public class Cuota {
	private int numero;
	private double cuota, capital, inicio, interes, abonoCapital, saldo;
	Utilitario u = new Utilitario();

	// Constructor
	public Cuota(int numero) {
		this.numero = numero;
	}

	public void mostrarPrestamo() {
		System.out.println(numero + " | " + u.redondear(cuota) + " | " + u.redondear(capital) + " | "
				+ u.redondear(interes) + " | " + u.redondear(abonoCapital) + " | " + u.redondear(saldo));
	}

	// Getters and Setters
	/**
	 * @return the cuota
	 */
	public final double getCuota() {
		return cuota;
	}

	/**
	 * @param cuota the cuota to set
	 */
	public final void setCuota(double cuota) {
		this.cuota = cuota;
	}

	/**
	 * @return the capital
	 */
	public final double getCapital() {
		return capital;
	}

	/**
	 * @param capital the capital to set
	 */
	public final void setCapital(double capital) {
		this.capital = capital;
	}

	/**
	 * @return the inicio
	 */
	public final double getInicio() {
		return inicio;
	}

	/**
	 * @param inicio the inicio to set
	 */
	public final void setInicio(double inicio) {
		this.inicio = inicio;
	}

	/**
	 * @return the interes
	 */
	public final double getInteres() {
		return interes;
	}

	/**
	 * @param interes the interes to set
	 */
	public final void setInteres(double interes) {
		this.interes = interes;
	}

	/**
	 * @return the abonoCapital
	 */
	public final double getAbonoCapital() {
		return abonoCapital;
	}

	/**
	 * @param abonoCapital the abonoCapital to set
	 */
	public final void setAbonoCapital(double abonoCapital) {
		this.abonoCapital = abonoCapital;
	}

	/**
	 * @return the saldo
	 */
	public final double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public final void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
