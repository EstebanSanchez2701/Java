package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono t = new Telefono(9, "movi", "0993434344");
		Contacto c = new Contacto("Luisa", "Gonzalez", t, 123);
		AdminContactos a = new AdminContactos();

		// imprimir tiene whatsapp false
		System.out.println("---------Primera Impresion whatsapp is false---------");
		System.out.println(c.getTelefono().isTieneWhatsapp());
		System.out.println(c.isActivo());
		
		a.activarUsuario(c);

		System.out.println("---------Segunda Impresion whatsapp is false---------");
		System.out.println(c.getTelefono().isTieneWhatsapp());
		System.out.println(c.isActivo());
	}

}
