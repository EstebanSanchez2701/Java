package com.krakedev.persistencia.test;

import java.math.BigDecimal;

import com.krakedev.persistencia.entidades.Usuario;
import com.krakedev.persistencia.servicios.AdminUsuarios;

public class TestUsuarioActualizar {

	public static void main(String[] args) {
		Usuario u = new Usuario("0109080722");
		System.out.println(u.getCedula());
		try {
			u.setNombre("MYRIAN");
			u.setApellido("SALAS");
			u.setTipoCuenta("FUTURO");
			u.setLimiteCredito(new BigDecimal(3298));
			AdminUsuarios.actualizar(u);
			System.out.println("Cliente Actualizado");
		} catch (Exception e) {
			System.out.println("Error en el sistema:" + e.getMessage());
		}


	}

}
