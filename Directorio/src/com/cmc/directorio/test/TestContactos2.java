package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono t1 = new Telefono(4, "mocntvi", "0912345678");
		Telefono t2 = new Telefono(2, "claro", "0921213243");
		Contacto contacto1 = new Contacto("Ivan", "kaviedes", t1, 60);
		Contacto contacto2 = new Contacto("Tin", "Delgado", t2, 45);
		AdminContactos ac = new AdminContactos();
		Contacto resultado1;
		boolean resultado2;

		resultado1 = ac.buscarMasPesado(contacto1, contacto2);
		resultado2 = ac.compararOperadoras(contacto1, contacto2);

		System.out.println("El mas pesado es: " + resultado1.getNombre() + " " + resultado1.getApellido() + " Peso: "
				+ resultado1.getPeso());
		System.out.println("El resutado de la comparación de operadores es: " + resultado2);
	}
	
}
