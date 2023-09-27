package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
		Cuadrado c3 = new Cuadrado();
		
		c1.lado = 4;
		c2.lado = 6;
		c3.lado = 5;
		
		c1.calcularArea();
		c1.calcularPerimetro();
		
		c2.calcularArea();
		c2.calcularPerimetro();
		
		c3.calcularArea();
		c3.calcularPerimetro();
	}

}
