package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado;
		Telefono telf1 = new Telefono(1,"movi","0987643212");
		Telefono telf2 = new Telefono(1,"claro","0912834561");
		Telefono telf3 = new Telefono(1,"claro","0987651442");
		Telefono telf4 = new Telefono(1,"claro","0987643218");
		AdminTelefono at = new AdminTelefono();
		
		resultado = at.contarClaro(telf1, telf2, telf3, telf4);
		
		System.out.println("Existen: "+ resultado + " telefonos que son de operador claro");
	}

}
