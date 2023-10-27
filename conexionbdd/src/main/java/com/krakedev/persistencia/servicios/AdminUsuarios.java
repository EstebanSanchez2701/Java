package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Usuario;
import com.krakedev.persistencia.utils.ConexionBdd;

public class AdminUsuarios {
	private static final Logger LOGGER = LogManager.getLogger(AdminUsuarios.class);

	public static void insertar(Usuario usuario) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Usuario a insertar >>>" + usuario);
		try {
			// abrir la conexion
			con = ConexionBdd.conectar();
			ps = con.prepareStatement("insert into usuario(cedula, nombre, apellido, tipo_cuenta, limite_credito)"
					+ "values(?,?,?,?,?)");
			ps.setString(1, usuario.getCedula());
			ps.setString(2, usuario.getNombre());
			ps.setString(3, usuario.getApellido());
			ps.setString(4, usuario.getTipoCuenta());
			ps.setBigDecimal(5, usuario.getLimiteCredito());

			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}

	}

	public static void actualizar(Usuario usuario) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Usuario a actualizar >>>" + usuario.getCedula());

		try {
			con = ConexionBdd.conectar();
			ps = con.prepareStatement("update usuario set nombre = ?, apellido=?,tipo_cuenta=?, limite_credito=?"
							+ "where cedula = ?)");
			// actualizaciones
			ps.setString(1, usuario.getNombre());
			ps.setString(2, usuario.getApellido());
			ps.setString(3, usuario.getTipoCuenta());
			ps.setBigDecimal(4, usuario.getLimiteCredito());

			ps.setString(5, usuario.getCedula());

			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al Actualizar", e);
			throw new Exception("Error al actualizar");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la conexión de la base", e);
				throw new Exception("Error con la conexión de la base");
			}
		}

	}

	public static void eliminar(String cedula) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Cedula a eliminar>>>" + cedula);

		try {
			con = ConexionBdd.conectar();
			ps = con.prepareStatement("delete from usuario where cedula = ?");
			// eliminar
			ps.setString(1, cedula);

			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al Eliminar", e);
			throw new Exception("Error al eliminar");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la conexión de la base", e);
				throw new Exception("Error con la conexión de la base");
			}
		}

	}
}
