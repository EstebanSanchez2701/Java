package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Telefono telf = new Telefono(20, "movi", "098234234");
		AdminTelefono at = new AdminTelefono();
		at.activarmensajeria(telf);
		
		
		System.out.println("codigo: "+telf.getCodigo());
		System.out.println("numero: "+telf.getNumero());
		System.out.println("operadora: "+telf.getOperadora());
		System.out.println("tiene Whatsapp: " + telf.isTieneWhatsapp());
	}

}
