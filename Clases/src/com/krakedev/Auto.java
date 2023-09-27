package com.krakedev;

public class Auto {
	private String tipo;
	private int anio;
	private float precio;

	// Constructor
	public Auto(String tipo, int anio, float precio) {
		this.tipo = tipo;
		this.anio = anio;
		this.precio = precio;
	}

	// Getters and Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
