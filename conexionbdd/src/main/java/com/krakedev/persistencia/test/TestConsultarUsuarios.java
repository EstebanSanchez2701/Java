package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Usuario;
import com.krakedev.persistencia.servicios.AdminUsuarios;

public class TestConsultarUsuarios {

	public static void main(String[] args) {
		try {
			Usuario usuarioEncontrado = AdminUsuarios.buscarCedulaUsuario("0192837465");
			System.out.println(usuarioEncontrado);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
