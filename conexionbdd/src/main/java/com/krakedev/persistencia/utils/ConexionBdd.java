package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConexionBdd {
	private static final Logger LOGGER = LogManager.getLogger(ConexionBdd.class);
	private final static String DRIVER = "org.postgresql.Driver";
	private final static String URL = "jdbc:postgresql://localhost:5432/postgres";
	private final static String USER = "postgres";
	private final static String PWD = "Isabella27";

	public static Connection conectar() throws Exception {
		Connection connection = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USER, PWD);
			LOGGER.debug("Conexion Exitosa");
		} catch (ClassNotFoundException e) {
			LOGGER.error("Error en la infraestructura",e);
			throw new Exception("Error en la infraestructura");
		}catch (SQLException e) {
			LOGGER.error("Error al conectarse revise usuario y clave",e);
			throw new Exception("Error al conectarse revise usuario y clave");
		}

		return connection;
	}
}
