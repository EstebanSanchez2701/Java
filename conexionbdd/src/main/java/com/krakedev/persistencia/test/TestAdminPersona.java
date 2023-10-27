package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminPersona {

	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("U", "Union Libre");
		Persona p = new Persona("0200311089", "Manuel", "Saviola", null);
		try {
			Date fechaNac = Convertidor.covertirFecha("1991/11/20");
			Date horaNac = Convertidor.covertirHora("08:31");
			p.setEstatura(1.76);
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setCantidadAhorrada(new BigDecimal(1200));
			p.setNumeroHijos(1);
			p.setEstadoCivil(ec);
			AdminPersonas.insertar(p);
			
		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
		}

	}
}
