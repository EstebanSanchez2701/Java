package com.krakedev.estaticos.ejercicio.test;

import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;

public class TestAlarmas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alarma a1 = new Alarma(DiasSemana.SABADO, 12, 25);

		
		AdminAlarmas admin = new AdminAlarmas();
		
		//agregar alarmas
		admin.agregarAlarma(a1);
		
		ArrayList<Alarma> alarmasActuales = admin.getAlarmas();
		System.out.println(alarmasActuales);
		
	}

}
