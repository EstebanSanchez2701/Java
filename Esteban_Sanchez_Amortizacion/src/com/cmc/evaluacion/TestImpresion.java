package com.cmc.evaluacion;

public class TestImpresion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utilitario u = new Utilitario();
		Cuota c1 = new Cuota(1);
		c1.setCuota(44.24);
		c1.setInicio(5000);
		c1.setInteres(50);
		c1.setAbonoCapital(394.24134);
		c1.setSaldo(4605.76);
		
		c1.mostrarPrestamo();
	}

}
