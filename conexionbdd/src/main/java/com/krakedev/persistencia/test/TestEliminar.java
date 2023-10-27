package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminar {

	public static void main(String[] args) {
		Persona p = new Persona("0200311089", null,null, null);
		try {
			AdminPersonas.eliminar(p.getCedula());
			System.out.println("Cliente eliminado: " + p.getCedula());
		} catch (Exception e) {
			System.out.println("Error en el sistema:" + e.getMessage());
		}

	}

}
