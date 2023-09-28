package com.cmc.repaso.trest;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item1 = new Item();
		Item item2 = new Item();
		
		item1.setNombre("Impresoras");
		item1.setProductosActuales(20);
		item1.vender(8);
		item1.imprimir();
		
		item2.setNombre("Laptops");
		item2.setProductosActuales(40);
		item2.vender(10);
		item2.devolver(9);
		item2.imprimir();
	}

}
