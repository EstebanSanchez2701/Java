package com.krakedev.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class TestAdminProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto mc;
		AdminProducto ap1 = new AdminProducto();
		Producto p1 = new Producto("Doritos", 0.50);
		Producto p2 = new Producto("Papitas", 0.50);
		
		mc = ap1.buscarMasCaro(p1, p2);
		
		if(mc == null) {
				System.out.println("Son Iguales");
		}else {
			System.out.println("El más caro es: "+mc.getNombre());
		}
		
	}

}
