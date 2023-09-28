package com.cmc.repaso.trest;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante e1 = new Estudiante("Esteban");
		e1.calificar(5);
		System.out.println("--------------------------------------------------");
		System.out.println("El nombre del estudiante es: " + e1.getNombre());
		System.out.println("La nota del estudiante es: " + e1.getNota());
		System.out.println("El resultado del estudiante es: " + e1.getResultado());
	}

}
