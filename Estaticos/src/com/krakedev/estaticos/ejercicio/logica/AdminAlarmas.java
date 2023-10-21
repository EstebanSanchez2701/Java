package com.krakedev.estaticos.ejercicio.logica;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;

public class AdminAlarmas {
	private ArrayList<Alarma> alarmas;
	
	
	
	public AdminAlarmas() {
		alarmas = new ArrayList<Alarma>();
	}

	public void agregarAlarma(Alarma alarma) {
		alarmas.add(alarma);
	}

	/**
	 * @return the alarmas
	 */
	public final ArrayList<Alarma> getAlarmas() {
		return alarmas;
	}
	
	
}
