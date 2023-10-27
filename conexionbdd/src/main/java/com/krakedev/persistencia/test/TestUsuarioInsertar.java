package com.krakedev.persistencia.test;

import java.math.BigDecimal;

import com.krakedev.persistencia.entidades.Usuario;
import com.krakedev.persistencia.servicios.AdminUsuarios;

public class TestUsuarioInsertar {

	public static void main(String[] args) {
		Usuario u = new Usuario("1718123266");
		try {
			u.setNombre("Esteban");
			u.setApellido("Sanchez");
			u.setLimiteCredito(new BigDecimal(12500));
			u.setTipoCuenta("CORRIENTE");
			AdminUsuarios.insertar(u);
			
		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
		}
	}

}
