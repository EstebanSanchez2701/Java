package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestVender {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("Q123","Colas",0.90);
		maquina.cargarProducto(producto, "A1", 8);
		
		Producto producto2=new Producto("Q123","Chupetes",0.15);
		maquina.cargarProducto(producto2, "A2", 7);
		
		Producto producto3=new Producto("Q123","Carameloss",0.10);
		maquina.cargarProducto(producto3, "B1", 6);
		
		Producto producto4=new Producto("D456","Tabacos",0.50);
		maquina.cargarProducto(producto4, "B2", 5);
		
		maquina.vender("A1");
		maquina.vender("B1");
		maquina.vender("A2");
		maquina.vender("B2");
		
		maquina.mostrarProductos();

	}

}
