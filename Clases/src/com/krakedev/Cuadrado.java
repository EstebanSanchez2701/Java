package com.krakedev;

public class Cuadrado {
	public double lado;

	public double calcularArea() {
		double area;
		area = lado * lado;
		return area;
	}

	public double calcularPerimetro() {
		double perimetro;
		perimetro = lado + lado + lado + lado;
		return perimetro;
	}
}
