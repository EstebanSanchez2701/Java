package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		//Modificar valores objeto 1
		auto1.tipo = "Jeep";
		auto1.anio = 2022;
		auto1.precio = 28400;
		//Modificar valores objeto 2
		auto2.tipo = "SUV";
		auto2.anio = 2015;
		auto2.precio = 16800;
		
		System.out.println("---------auto 1---------");
		System.out.println("el tipo del auto 1 es: "+auto1.tipo);
		System.out.println("el año del auto 1 es: "+auto1.anio);
		System.out.println("el precio del auto 1 es: "+auto1.precio);
		
		System.out.println("---------auto 2---------");
		System.out.println("el tipo del auto 2 es: "+auto2.tipo);
		System.out.println("el año del auto 2 es: "+auto2.anio);
		System.out.println("el precio del auto 2 es: "+auto2.precio);
		
	}

}
