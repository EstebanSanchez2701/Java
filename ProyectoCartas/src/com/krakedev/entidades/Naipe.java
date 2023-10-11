package com.krakedev.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;
	private ArrayList<Carta> auxiliar;

	// Constructor
	public Naipe() {
		this.auxiliar = new ArrayList<Carta>();
		this.numerosPosibles = new ArrayList<Numero>();
		this.cartas = new ArrayList<Carta>();

		Numero numeroA = new Numero("A", 11);
		Numero numero2 = new Numero("2", 2);
		Numero numero3 = new Numero("3", 3);
		Numero numero4 = new Numero("4", 4);
		Numero numero5 = new Numero("5", 5);
		Numero numero6 = new Numero("6", 6);
		Numero numero7 = new Numero("7", 7);
		Numero numero8 = new Numero("8", 8);
		Numero numero9 = new Numero("9", 9);
		Numero numero10 = new Numero("10", 10);
		Numero numeroJ = new Numero("J", 10);
		Numero numeroQ = new Numero("Q", 10);
		Numero numeroK = new Numero("K", 10);

		numerosPosibles.add(numeroA);
		numerosPosibles.add(numero2);
		numerosPosibles.add(numero3);
		numerosPosibles.add(numero4);
		numerosPosibles.add(numero5);
		numerosPosibles.add(numero6);
		numerosPosibles.add(numero7);
		numerosPosibles.add(numero8);
		numerosPosibles.add(numero9);
		numerosPosibles.add(numero10);
		numerosPosibles.add(numeroJ);
		numerosPosibles.add(numeroQ);
		numerosPosibles.add(numeroK);

		Numero elementoNumero;

		for (int i = 0; i < numerosPosibles.size(); i++) {
			elementoNumero = numerosPosibles.get(i);
			Carta cartaAgregada1 = new Carta(elementoNumero, Palos.corazonRojo);
			cartas.add(cartaAgregada1);
			Carta cartaAgregada2 = new Carta(elementoNumero, Palos.corazonRojo);
			cartas.add(cartaAgregada2);
			Carta cartaAgregada3 = new Carta(elementoNumero, Palos.diamante);
			cartas.add(cartaAgregada3);
			Carta cartaAgregada4 = new Carta(elementoNumero, Palos.trebol);
			cartas.add(cartaAgregada4);
		}
	}

	public ArrayList<Carta> barajar() {
		Random r = new Random();
		Carta cartaEnPosicion;
		Carta cartaNoEnviadaAuxiliar;

		for (int i = 1; i <= 100; i++) {
			cartaEnPosicion = cartas.get(r.obtenerPosicion());
			if (cartaEnPosicion.getEstado().equalsIgnoreCase("N")) {
				auxiliar.add(cartaEnPosicion);
				cartaEnPosicion.setEstado("C");
			}
		}
		for (int j = 0; j < cartas.size(); j++) {
			cartaNoEnviadaAuxiliar = cartas.get(j);
			if(cartaNoEnviadaAuxiliar.getEstado().equalsIgnoreCase("N")) {
				auxiliar.add(cartaNoEnviadaAuxiliar);
				cartaNoEnviadaAuxiliar.setEstado("C");
			}
		}
		return auxiliar;
	}

	// Get de cartas
	public final ArrayList<Carta> getCartas() {
		return cartas;
	}

}
