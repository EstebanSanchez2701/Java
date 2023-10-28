package com.krakedev.evaluacion.test;

import java.util.ArrayList;

import com.krakedev.evaluacion.entidades.Categoria;
import com.krakedev.evaluacion.servicios.ServiciosCategoria;

public class TestRecuperarCategorias {

	public static void main(String[] args) {
		try {
			ArrayList<Categoria> categorias = ServiciosCategoria.recuperarTodos();
			System.out.println(categorias);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
