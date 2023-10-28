package com.krakedev.evaluacion.test;

import com.krakedev.evaluacion.excepciones.KrakeException;
import com.krakedev.evaluacion.utils.ConexionBdd;

public class TestConexionBDD {

	public static void main(String[] args) {
		 try {
			ConexionBdd.conectar();
			System.out.println("Conexion Exitoso");
		} catch (KrakeException e) {
			// TODO Auto-generated catch blockS
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
