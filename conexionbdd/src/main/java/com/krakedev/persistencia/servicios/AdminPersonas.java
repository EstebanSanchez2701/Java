package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBdd;

public class AdminPersonas {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static void insertar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a insertar >>>" + persona);
		try {
			// abrir la conexion
			con = ConexionBdd.conectar();
			ps = con.prepareStatement("insert into personas(cedula, nombre, apellido, estatura, cantidad_ahorrada, "
					+ "numero_hijos, fecha_nacimiento, hora_nacimiento, estado_civil_codigo)"
					+ "values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setDouble(4, persona.getEstatura());
			ps.setBigDecimal(5, persona.getCantidadAhorrada());
			ps.setInt(6, persona.getNumeroHijos());
			ps.setDate(7, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(8, new Time(persona.getHoraNacimiento().getTime()));
			ps.setString(9, persona.getEstadoCivil().getCodigo());

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

	public static void actualizar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a actualizar >>>" + persona.getCedula());

		try {
			con = ConexionBdd.conectar();
			ps = con.prepareStatement("update personas set nombre = ?, apellido = ?, estatura = ?, cantidad_ahorrada = ?, "
					+ "numero_hijos = ?, fecha_nacimiento = ?, hora_nacimiento= ?, estado_civil_codigo = ?"
					+ "where cedula = ?)");
			//actualizaciones
			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getApellido());
			ps.setDouble(3, persona.getEstatura());
			ps.setBigDecimal(4, persona.getCantidadAhorrada());
			ps.setInt(5, persona.getNumeroHijos());
			ps.setDate(6, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(7, new Time(persona.getHoraNacimiento().getTime()));
			ps.setString(8, persona.getEstadoCivil().getCodigo());
			ps.setString(9, persona.getCedula());
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			LOGGER.error("Error al Actualizar",e);
			throw new Exception("Error al actualizar");
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la conexión de la base",e);
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
			ps = con.prepareStatement("delete from personas where cedula = ?");
			//eliminar
			ps.setString(1,cedula);
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			LOGGER.error("Error al Eliminar",e);
			throw new Exception("Error al eliminar");
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la conexión de la base",e);
				throw new Exception("Error con la conexión de la base");
			}
		}

	}
}
