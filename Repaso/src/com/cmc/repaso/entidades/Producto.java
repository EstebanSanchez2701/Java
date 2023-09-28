package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;

	// Constructor
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	// Metodos
	public double calcularPrecioPromo(double porcentaje) {
		double precioDescuento;
		precioDescuento = this.precio - (this.precio * porcentaje);
		return precioDescuento;
	}

	// Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
		if (precio < 0) {
			this.precio = precio * -1;
		}

	}
}
