package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Usuario;
import com.krakedev.persistencia.servicios.AdminUsuarios;

public class TestUsuarioEliminar {

	public static void main(String[] args) {
		Usuario u = new Usuario("1718123266");

		try {
			AdminUsuarios.eliminar(u.getCedula());
			System.out.println("Usuario Eliminado: " + u.getCedula());
		} catch (Exception e) {
			System.out.println("Error en el sistema:" + e.getMessage());
		}

	}

}
