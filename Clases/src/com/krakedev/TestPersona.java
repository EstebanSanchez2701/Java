package com.krakedev;

/*
 * Comentario varias lineas
 * 
 * */
public class TestPersona {

	public static void main(String[] args) {
		Persona p; // Declaro una variable de tipo persona
		p = new Persona(); // 2. Instanciar un objeto persona,
		
		Persona p3 = new Persona("Pablo");
		Persona p4 = new Persona("Esteban", 31, 1.62);
		
		System.out.println("nombre: " + p4.getNombre());
		System.out.println("edad: " + p4.getEdad());
		System.out.println("estatura: " + p4.getEstatura());
		
		// 3- Accedo a los atributos
		System.out.println("nombre: " + p.getNombre());
		System.out.println("edad: " + p.getEdad());
		System.out.println("estatura: " + p.getEstatura());

		// 4. Modificar atributos
		p.setNombre("Mario");
		p.setEdad(45);
		p.setEstatura(1.56);
		
		System.out.println("nombre: " + p.getNombre());
		System.out.println("edad: " + p.getEdad());
		System.out.println("estatura: " + p.getEstatura());
	}

}
