package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Persona> personas;
		personas = new ArrayList<Persona>();

		personas.add(new Persona("Leo", "Messi"));
		personas.add(new Persona("Cristiano", "Ronaldo"));
		personas.add(new Persona("Enner", "Valencia"));
		
		Persona elementoPersona;
		
		for (int i = 0; i < personas.size(); i++) {
			elementoPersona = personas.get(i);
			System.out.println(elementoPersona.getNombre()+"-"+elementoPersona.getApellido());
		}
	}

}
