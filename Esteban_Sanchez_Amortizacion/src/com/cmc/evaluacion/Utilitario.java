package com.cmc.evaluacion;

public class Utilitario {
	public static double redondear (double valor) {
		double valorRedondo = 0;
		valorRedondo = Math.round(valor*100.0)/100.0;
		return valorRedondo;
	}
}
