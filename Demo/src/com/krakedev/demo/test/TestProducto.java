package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p1 = new Producto(1,"Celulares");
		
		//MOdificar los valores de descripción y peso
		p1.setDescripcion("Dispositivos Moviles");
		p1.setPeso(12);
		
		//Imprimir en pantalla los valores
		System.out.println("---------Productos---------");
		System.out.println("El codigo del producto es: " + p1.getCodigo());
		System.out.println("El nombre del producto es: " + p1.getNombre());
		System.out.println("La descripción del producto es: " + p1.getDescripcion());
		System.out.println("El peso  del producto es: " + p1.getPeso());
	}

}
