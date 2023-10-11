package com.krakedev.servicios;

import java.util.ArrayList;

import com.krakedev.entidades.Carta;
import com.krakedev.entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugadores;
	private ArrayList<Carta> naipeBarajado;

	// ConstructorVacio
	public Juego() {
		this.naipe = new Naipe();
		this.naipeBarajado = new ArrayList<Carta>();
		naipeBarajado = naipe.barajar();
	}

	// Constructor
	public Juego(ArrayList<String> jugadores) {
		this.naipe = new Naipe();
		this.naipeBarajado = new ArrayList<Carta>();
		naipeBarajado = naipe.barajar();
		cartasJugadores = new ArrayList<ArrayList<Carta>>();
		// String elementoJugador;
		for (int i = 0; i < jugadores.size(); i++) {
			cartasJugadores.add(new ArrayList<Carta>());
			System.out.println(jugadores.size());
		}
	}

	public void entregarCartas(int cartasPorJugador) {
		int numeroJugadores = cartasJugadores.size();
		int numeroDeCartas = numeroJugadores * cartasPorJugador;
		int jugadores = 0;
		Carta cartaEntregada;
		for (int i = 0; i < numeroDeCartas; i++) {
			cartaEntregada = naipeBarajado.get(i);
			cartasJugadores.get(jugadores).add(cartaEntregada);
			jugadores = (jugadores + 1) % numeroJugadores;
		}
	}

	public int devolverTotal(String idJugador) {
		int total = 0;
		// Buscar el índice del jugador correspondiente al id
		int jugadorIndex = -1;
		for (int i = 0; i < cartasJugadores.size(); i++) {
			if (("jugador " + (i + 1)).equalsIgnoreCase(idJugador)) {
				jugadorIndex = i;
				break;
			}
		}

		if (jugadorIndex != -1) {
			ArrayList<Carta> cartas = cartasJugadores.get(jugadorIndex);
			for (int j = 0; j < cartas.size(); j++) {
				Carta carta = cartas.get(j);
				total += carta.getNumero().getValor();
			}
		}

		return total;
	}

	public String determinarGanador() {
		String idGanador = " ";
		int totalGanador = 0;
		int total = 0;
		// Buscar el índice del jugador correspondiente al id
		int jugadorIndex = -1;
		for (int i = 0; i < cartasJugadores.size(); i++) {
			jugadorIndex = i;

			if (jugadorIndex != -1) {
				total = devolverTotal("Jugador " + (jugadorIndex + 1));
				if (total > totalGanador) {
					totalGanador = total;
					total = 0;
					idGanador = "Jugador " + (jugadorIndex + 1);
				}
			}
		}

		return idGanador;
	}

	/**
	 * @return the cartasJugadores
	 */
	public final ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}
}
