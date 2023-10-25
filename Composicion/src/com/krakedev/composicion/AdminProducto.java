package com.krakedev.composicion;

public class AdminProducto {
	// Recibe 2 productos
	// Retorna el de mayor precio
	// Si tiene el mismo precio retorna null
	public Producto buscarMasCaro(Producto p1, Producto p2) {
		if (p1.getPrecio() > p2.getPrecio()) {
			return p1;
		}else if(p1.getPrecio() < p2.getPrecio()) {
			return p2;
		}else {
			return null;
		}
		
	}

}
