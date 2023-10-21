package com.krakedev.herencia;

public class Cuenta {
	private String numeroCuenta;
	private double saldo;
	
	
	
	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + "]";
	}
	
	
	public Cuenta(String numeroCuenta, double saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}
	/**
	 * @return the numeroCuenta
	 */
	public final String getNumeroCuenta() {
		return numeroCuenta;
	}
	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	public final void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
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
