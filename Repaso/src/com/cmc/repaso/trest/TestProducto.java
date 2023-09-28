package com.cmc.repaso.trest;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double resultado;
		Producto p = new Producto("Lentes", 100);
		resultado = p.calcularPrecioPromo(0.1);

		System.out.println("-------------VALORES INICIALES-------------");
		System.out.println("el nombre del producto es: " + p.getNombre());
		System.out.println("el precio del producto es: " + p.getPrecio());
		System.out.println("Con descuento el precio es: "+resultado);

		p.setPrecio(-4);
		resultado = p.calcularPrecioPromo(0.2);

		System.out.println("-------------VALORES MODIFICADOS-------------");
		System.out.println("el nombre del producto es: " + p.getNombre());
		System.out.println("el precio promo es: " + p.getPrecio());
		System.out.println("Con descuento el precio es: "+resultado);

	}

}
