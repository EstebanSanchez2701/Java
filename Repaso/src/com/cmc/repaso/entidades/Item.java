package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	public void imprimir() {
		System.out.println("(------------------------------");
		System.out.println("El producto es: " + nombre);
		System.out.println("El total de productos actuales es: " + productosActuales);
		System.out.println("El total de productos devueltos es: " + productosDevueltos);
		System.out.println("El total de productos devueltos es: " + productosVendidos);
	}
	
	public void vender(int productosVendidos) {
		this.productosVendidos = this.productosVendidos + productosVendidos;
		this.productosActuales = this.productosActuales - productosVendidos;
	}
	
	public void devolver(int productosVendidos) {
		this.productosDevueltos = this.productosDevueltos + productosVendidos;
		this.productosActuales = this.productosActuales + productosVendidos;
		this.productosVendidos = this.productosVendidos - productosVendidos;
	}
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getProductosActuales() {
		return productosActuales;
	}
	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}
	public int getProductosDevueltos() {
		return productosDevueltos;
	}
	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}
	public int getProductosVendidos() {
		return productosVendidos;
	}
	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}
	
	
}
