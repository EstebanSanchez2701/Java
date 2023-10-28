package com.krakedev.evaluacion.entidades;

public class Categoria {
	private String idCategoria;
	private String nombre;
	
	public Categoria() {
		
	}
	
	public Categoria(String id_categoria, String nombre) {
		super();
		this.idCategoria = id_categoria;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Categoria [id_categoria=" + idCategoria + ", nombre=" + nombre + "]";
	}

	//Getters y Setters
	public String getId_categoria() {
		return idCategoria;
	}


	public void setId_categoria(String id_categoria) {
		this.idCategoria = id_categoria;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
