package com.cmc.repaso.entidades;

public class Validacion {
	public boolean validarMonto(int monto) {
		boolean resultado;
		if(monto > 0) {
			resultado = true;
			System.out.println("Monto mayor a cero");
		}else {
			resultado = false;
			System.out.println("Monto menor o igual a  cero");
		}
		return resultado;
	}
}
