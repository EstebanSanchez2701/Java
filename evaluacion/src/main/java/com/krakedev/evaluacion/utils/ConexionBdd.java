package com.krakedev.evaluacion.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.evaluacion.excepciones.KrakeException;

public class ConexionBdd {
	private static final Logger LOGGER = LogManager.getLogger(ConexionBdd.class);
	private final static String DRIVER = "org.postgresql.Driver";
	private final static String URL = "jdbc:postgresql://localhost:5432/postgres";
	private final static String USER = "postgres";
	private final static String PWD = "postgres";

	public static Connection conectar() throws KrakeException {
		Connection connection = null;
		try {
			LOGGER.trace("Obteniendo Conexion");
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USER, PWD);
			LOGGER.trace("Conexion Exitosa");
		} catch (ClassNotFoundException e) {
			LOGGER.error("Error en la infraestructura");
			throw new KrakeException("Error en la infraestructura");
		}catch (SQLException e) {
			LOGGER.error("Error al conectarse revise usuario y clave");
			throw new KrakeException("Error al conectarse revise usuario y clave");
		}

		return connection;
	}
}
