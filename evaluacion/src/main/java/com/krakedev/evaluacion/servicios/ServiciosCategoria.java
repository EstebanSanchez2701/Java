package com.krakedev.evaluacion.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.evaluacion.entidades.Categoria;
import com.krakedev.evaluacion.excepciones.KrakeException;
import com.krakedev.evaluacion.utils.ConexionBdd;

public class ServiciosCategoria {
	private static final Logger LOGGER = LogManager.getLogger(ServiciosCategoria.class);

	public static void insertar(Categoria categoria) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("categoria a insertar >>>" + categoria);
		try {
			// abrir la conexion
			con = ConexionBdd.conectar();
			ps = con.prepareStatement("insert into public.categorias(id_categoria, nombre)" + "values(?,?)");
			ps.setString(1, categoria.getId_categoria());
			ps.setString(2, categoria.getNombre());
			ps.executeUpdate();

		} catch (KrakeException ke) {
			LOGGER.error(ke);
			throw ke;
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new KrakeException("Error con la base de datos");
			}
		}
	}

	public static void actualizar(Categoria categoria) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("categoria a actualizar >>>" + categoria);
		try {
			// abrir la conexion
			con = ConexionBdd.conectar();
			ps = con.prepareStatement("update public.categorias set nombre = ? where id_categoria = ?");
			ps.setString(1, categoria.getNombre());
			ps.setString(2, categoria.getId_categoria());

			ps.executeUpdate();

		} catch (KrakeException ke) {
			LOGGER.error(ke);
			throw ke;
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new KrakeException("Error con la base de datos");
			}
		}
	}

	public static Categoria buscarPorId(String idCategoria) throws Exception {
		Categoria categoriaEncontrada = new Categoria();
		Connection con = null;
		PreparedStatement ps;
		ResultSet rs = null;
		try {
			con = ConexionBdd.conectar();
			ps = con.prepareStatement("select * from categorias where id_categoria = ?");
			ps.setString(1, idCategoria);
			rs = ps.executeQuery();

			if (rs.next()) {
				String id = rs.getString("id_categoria");
				String nombre = rs.getString("nombre");

				categoriaEncontrada.setId_categoria(id);
				categoriaEncontrada.setNombre(nombre);

			}

		} catch (KrakeException e) {
			LOGGER.error("Error al consultar por cedula", e);
			throw new KrakeException("Error al consultar por cedula");

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base");
			}
		}

		return categoriaEncontrada;
	}

	public static ArrayList<Categoria> recuperarTodos() throws Exception {
		ArrayList<Categoria> categorias = new ArrayList<Categoria>();
		Connection con = null;
		PreparedStatement ps;
		ResultSet rs = null;
		try {
			con = ConexionBdd.conectar();
			ps = con.prepareStatement("select * from categorias");

			rs = ps.executeQuery();

			while (rs.next()) {
				String id = rs.getString("id_categoria");
				String nombre = rs.getString("nombre");
				Categoria c = new Categoria();
				c.setId_categoria(id);
				c.setNombre(nombre);
				
				categorias.add(c);
			}

		} catch (Exception e) {
			LOGGER.error("Error al consultar categorias", e);
			throw new Exception("Error al consultar categorias");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}

		return categorias;
	}
}
