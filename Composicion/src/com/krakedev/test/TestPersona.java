package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona();
		p1.setNombre("Juan");
		p1.setApellido("Enriquez");
		Direccion dir = new Direccion();
		dir.setCallePrincipal("la 8");
		dir.setCalleSecundaria("la 3");
		dir.setNumero("N54");
		p1.setDireccion(dir);
		
		String nombre = p1.getNombre();
		Direccion d1 = p1.getDireccion();
		
		System.out.println(nombre);
		System.out.println(d1.getCallePrincipal());
		
		p1.imprimir();
		
		Persona p2 = new Persona();
		Direccion d2 = new Direccion("Av Shirys", "Eloy Alfaro", "5");
		p2.setNombre("Juana");
		p2.setDireccion(d2);
		
		p2.imprimir();
		
		Persona p3 = new Persona();
		Direccion d3 = new Direccion("xx", "yy", "123");
		p3.imprimir();
		
		
	}

}
