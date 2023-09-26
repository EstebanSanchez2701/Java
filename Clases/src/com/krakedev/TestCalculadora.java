package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calculadora = new Calculadora();
		int resultadoSuma;
		int resultadoResta;
		double resultadoMulti;
		double resultadoDivi;
		double promedio;
		
		resultadoSuma = calculadora.sumar(5, 3);
		resultadoResta = calculadora.restar(10, 3);
		resultadoMulti = calculadora.multiplicar(10, 5);
		resultadoDivi = calculadora.dividir(10, 2);
		promedio = calculadora.promediar(10, 8, 9);
		
		System.out.println("El resultado de la suma es: " + resultadoSuma);
		System.out.println("El resultado de la resta es: " + resultadoResta);
		System.out.println("El resultado de la multiplicacion es: "+ resultadoMulti);
		System.out.println("El resultado de la division es: "+ resultadoDivi);
		System.out.println("El promedio es: "+promedio);
		calculadora.mostrarResultado();
		
	}

}
