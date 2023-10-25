package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminPersonas admin = new AdminPersonas();
		admin.agregar(new Persona("Juan", "Perez", 20));
		admin.agregar(new Persona("Bruno", "Diaz", 60));
		admin.agregar(new Persona("Tony", "Stark", 30));
		admin.agregar(new Persona("Peter", "Perez", 18));
		admin.imprimir();

		Persona p1 = admin.buscarPorNombre("Tony");
		if(p1!=null) {
			System.out.println("ENCONTRAD:" + p1.getApellido()+"-"+p1.getEdad());	
		}else {
			System.out.println("No existe la persona con el nombre escrito");
		}
		
		ArrayList<Persona> personasMayores = admin.buscarMayores(10);
		System.out.println("mayores: " + personasMayores.size());
	}

}
