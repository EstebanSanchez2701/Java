package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto producto1 = new Producto();
		Producto producto2 = new Producto();
		Producto producto3 = new Producto();
		
		producto1.nombre = "Paracetamol";
		producto1.descripcion = "Para cualquier tipo de dolor";
		producto1.precio = 1.50;
		producto1.stockActual = 100;
		
		producto2.nombre = "Buscapina";
		producto2.descripcion = "Dolor estomacal";
		producto2.precio = 0.6;
		producto2.stockActual = 70;
		
		producto3.nombre = "Lemonflu";
		producto3.descripcion = "Antigripal";
		producto3.precio = 1;
		producto3.stockActual = 8;
		
		System.out.println("----------PRODUCTO 1----------");
		System.out.println("El nombre del producto 1 es: "+producto1.nombre);
		System.out.println("La descripcion del producto 1 es: "+producto1.descripcion);
		System.out.println("El precio del producto 1 es: "+producto1.precio);
		System.out.println("El stock del producto 1 es: "+producto1.stockActual);
		
		System.out.println("----------PRODUCTO 2----------");
		System.out.println("El nombre del producto 2 es: "+producto2.nombre);
		System.out.println("La descripcion del producto 2 es: "+producto2.descripcion);
		System.out.println("El precio del producto 2 es: "+producto2.precio);
		System.out.println("El stock del producto 2 es: "+producto2.stockActual);
		
		System.out.println("----------PRODUCTO 3----------");
		System.out.println("El nombre del producto 3 es: "+producto3.nombre);
		System.out.println("La descripcion del producto 3 es: "+producto3.descripcion);
		System.out.println("El precio del producto 3 es: "+producto3.precio);
		System.out.println("El stock del producto 3 es: "+producto3.stockActual);
	}

}
