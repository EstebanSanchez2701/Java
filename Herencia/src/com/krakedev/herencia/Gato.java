package com.krakedev.herencia;

public class Gato extends Animal {

	public void dormir() {
		System.out.println("Gato durmiendo");
	}

	public void maullar() {
		System.out.println("gato maullando");
	}
	
	public void maullar(String adjetivo) {
		System.out.println("gato maullando " + adjetivo);
	}
}
