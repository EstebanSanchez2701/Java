package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {

	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("U", "Union Libre");
		Persona p = new Persona("1718123266", "Juan", "Perez", null);
		System.out.println(p.getCedula());
		try {
			Date fechaNac = Convertidor.covertirFecha("1984/12/31");
			Date horaNac = Convertidor.covertirHora("10:12");
			p.setEstatura(1.67);
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setCantidadAhorrada(new BigDecimal(3300));
			p.setNumeroHijos(2);
			p.setEstadoCivil(ec);
			AdminPersonas.actualizar(p);
		} catch (Exception e) {
			System.out.println("Error en el sistema:" + e.getMessage());
		}

	}

}
