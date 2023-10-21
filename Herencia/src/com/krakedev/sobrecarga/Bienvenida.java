package com.krakedev.sobrecarga;

public class Bienvenida {
	public void saludar(String nombre) {
		System.out.println("hola "+ nombre);
	}
	
	public void saludar(String apellido, String nombre) {
		System.out.println("hola "+ apellido + " "+ nombre);
	}
}
