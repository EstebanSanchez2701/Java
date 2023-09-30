package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf = new Telefono(1, "claro", "0984682389");
		Contacto c = new Contacto("Esteban", "Sanchez", telf, 120);

		System.out.println(
				"Nombre: " + c.getNombre() + " Apellido: " + c.getApellido() + " Peso: " + c.getPeso() + " Codigo: "
						+ telf.getCodigo() + " Numero: " + telf.getNumero() + " Operadora: " + telf.getOperadora());
	}

}
