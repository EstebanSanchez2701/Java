package com.krakedev.evaluacion.test;

import com.krakedev.evaluacion.entidades.Categoria;
import com.krakedev.evaluacion.servicios.ServiciosCategoria;

public class TestInsertarCategoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Categoria c = new Categoria("C005", "Dulces");
		try {
			ServiciosCategoria.insertar(c);
			System.err.println("Categoria Insertado");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error en el sistema: " + e.getMessage());
		}
	}

}
