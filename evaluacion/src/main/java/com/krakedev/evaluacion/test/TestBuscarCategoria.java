package com.krakedev.evaluacion.test;

import com.krakedev.evaluacion.entidades.Categoria;
import com.krakedev.evaluacion.servicios.ServiciosCategoria;

public class TestBuscarCategoria {

	public static void main(String[] args) {
		try {
			Categoria cat = ServiciosCategoria.buscarPorId("C004");
			System.out.println(cat);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
