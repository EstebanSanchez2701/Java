package com.krakedev.evaluacion.test;

import com.krakedev.evaluacion.entidades.Categoria;
import com.krakedev.evaluacion.servicios.ServiciosCategoria;

public class TestActualizarCategoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Categoria c = new Categoria("C005", "Nuevos Dulces");
		try {
			ServiciosCategoria.actualizar(c);
			System.out.println("Categoria Actualizado");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error en el sistema: " + e.getMessage());
		}
	}

}
