package com.krakedev.entidades;

public class Random {
	public static int obtenerPosicion() {
		double random = 0.0;
		int randomEntero = 0;
		random = Math.random() * 51 + 1;
		randomEntero = (int)random;
		System.out.println(random);
		System.out.println(randomEntero);
		return randomEntero;
	}

}
