package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaquinaDulces ma = new MaquinaDulces();

		ma.agregarCelda("c1");
		ma.agregarCelda("c2");
		ma.agregarCelda("c3");
		ma.agregarCelda("c4");
		ma.agregarCelda("c5");
		ma.agregarCelda("c6");

		Producto p1 = new Producto("1", "Television", 23);
		Producto p2 = new Producto("2", "Celular", 50);
		Producto p3 = new Producto("3", "Xbox", 60);
		Producto p4 = new Producto("4", "PS5", 100);
		Producto p5 = new Producto("5", "PS4", 12);
		Producto p6 = new Producto("6", "Laptop", 33);

		ma.cargarProducto(p1, "c1", 2);
		ma.cargarProducto(p2, "c2", 3);
		ma.cargarProducto(p3, "c3", 4);
		ma.cargarProducto(p4, "c4", 5);
		ma.cargarProducto(p5, "c5", 6);
		ma.cargarProducto(p6, "c6", 7);

		ArrayList<Producto> menores = ma.buscarMenores(60);
		Producto elementoProducto;
		System.out.println("---------MENORES LIMITE---------");
		for (int i = 0; i < menores.size(); i++) {
			elementoProducto = menores.get(i);
			System.out.println("codigo: " + elementoProducto.getCodigo() + " Nombre: " + elementoProducto.getNombre()
					+ " Precio: " + elementoProducto.getPrecio());
		}

	}

}
