package com.clearminds.componentes;

public class Celda {

	private Producto producto;
	private int stock;
	private String codigo;

	public void ingresarProducto(Producto producto, int stockInicial) {
		this.producto = producto;
		this.stock = stockInicial;
	}

	// constructor
	public Celda(String codigo) {
		this.codigo = codigo;
	}

	
	
	//getters and setters
	
	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
