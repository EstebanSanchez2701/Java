package com.krakedev.demo;

public class Producto {
	private int codigo;
	private String descripcion;
	private String nombre;
	private double peso;
	
	//Constructor
	public Producto(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	//Getters and Setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
