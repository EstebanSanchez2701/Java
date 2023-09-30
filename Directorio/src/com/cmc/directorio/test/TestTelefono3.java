package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado;
		Telefono telf1 = new Telefono(1,"movi","098764321");
		Telefono telf2 = new Telefono(1,"movi","098764321");
		Telefono telf3 = new Telefono(1,"claro","098764321");
		AdminTelefono at = new AdminTelefono();
		
		resultado = at.contarMovi(telf1, telf2, telf3);
		
		System.out.println("Existen: "+ resultado + " telefonos que son de operador movi");
	}

}
