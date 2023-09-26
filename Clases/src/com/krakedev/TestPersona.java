package com.krakedev;

/*
 * Comentario varias lineas
 * 
 * */
public class TestPersona {

	public static void main(String[] args) {
		Persona p; // Declaro una variable de tipo persona
		Persona p2 = new Persona();
		p = new Persona(); // 2. Instanciar un objeto persona,
		// 3- Accedo a los atributos
		System.out.println("nombre: " + p.nombre);
		System.out.println("edad: " + p.edad);
		System.out.println("estatura: " + p.estatura);

		// 4. Modificar atributos
		p.nombre = "Mario";
		p.edad = 45;
		p.estatura = 1.56;
		
		System.out.println("--------------------");
		System.out.println("nombre: " + p.nombre);
		System.out.println("edad: " + p.edad);
		System.out.println("estatura: " + p.estatura);
	}

}
