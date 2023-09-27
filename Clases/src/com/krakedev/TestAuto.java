package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		//Modificar valores objeto 1
		auto1.setTipo("Jeep");
		auto1.setAnio(2022);
		auto1.setPrecio(28400);
		//Modificar valores objeto 2
		auto2.setTipo("SUV");
		auto2.setAnio(2015);
		auto2.setPrecio(16800);
		
		System.out.println("---------auto 1---------");
		System.out.println("el tipo del auto 1 es: "+auto1.getTipo());
		System.out.println("el año del auto 1 es: "+auto1.getAnio());
		System.out.println("el precio del auto 1 es: "+auto1.getPrecio());
		
		System.out.println("---------auto 2---------");
		System.out.println("el tipo del auto 2 es: "+auto2.getTipo());
		System.out.println("el año del auto 2 es: "+auto2.getAnio());
		System.out.println("el precio del auto 2 es: "+auto2.getPrecio());
		
	}

}
