package com.krakedev.excepciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inicio");
		String a = null;
		try {
			a.substring(3);
			System.out.println("fin");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("entra la catch");
		}finally {
			System.out.println("ingreso al finally");
		}
		System.out.println("fuera del catch");

	}

}
