package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto producto1 = new Producto();
		Producto producto2 = new Producto();
		Producto producto3 = new Producto();
		
		producto1.setNombre("Paracetamol");
		producto1.setDescripcion("Para cualquier tipo de dolor");
		producto1.setPrecio(5);
		producto1.setStockActual(100);
		
		producto2.setNombre("Buscapina");
		producto2.setDescripcion("Dolor estomacal");
		producto2.setPrecio(6);
		producto2.setStockActual(70);
		
		producto3.setNombre( "Lemonflu");
		producto3.setDescripcion( "Antigripal");
		producto3.setPrecio(1);
		producto3.setStockActual(8);
		
		System.out.println("----------PRODUCTO 1----------");
		System.out.println("El nombre del producto 1 es: "+producto1.getNombre());
		System.out.println("La descripcion del producto 1 es: "+producto1.getDescripcion());
		System.out.println("El precio del producto 1 es: "+producto1.getPrecio());
		System.out.println("El stock del producto 1 es: "+producto1.getStockActual());
		
		System.out.println("----------PRODUCTO 2----------");
		System.out.println("El nombre del producto 2 es: "+producto2.getNombre());
		System.out.println("La descripcion del producto 2 es: "+producto2.getDescripcion());
		System.out.println("El precio del producto 2 es: "+producto2.getPrecio());
		System.out.println("El stock del producto 2 es: "+producto2.getStockActual());
		
		System.out.println("----------PRODUCTO 3----------");
		System.out.println("El nombre del producto 3 es: "+producto3.getNombre());
		System.out.println("La descripcion del producto 3 es: "+producto3.getDescripcion());
		System.out.println("El precio del producto 3 es: "+producto3.getPrecio());
		System.out.println("El stock del producto 3 es: "+producto3.getStockActual());
	}

}
