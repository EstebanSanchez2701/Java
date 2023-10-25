package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"Isabella27");
			System.out.println("Conexion exitosa");
			ps = connection.prepareStatement(
					"insert into personas(cedula, nombre, apellido, estatura, cantidad_ahorrada, "
					+ "numero_hijos, fecha_nacimiento, hora_nacimiento)"
							+ "values(?,?,?,?,?,?,?,?)");
			ps.setString(1, "1718123266");
			ps.setString(2, "Esteban");
			ps.setString(3, "Sanchez");
			ps.setDouble(4, 1.65);
			ps.setBigDecimal(5, new BigDecimal(2300));
			ps.setInt(6, 2);

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr = "2022/10/12 10:45:23";
			try {
				Date fecha = sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechaMilis = fecha.getTime();// me devuelve en milisegundos la fecha
				System.out.println(fechaMilis);

				// crea un java.sqlDate, partiendo de un java.util.Date
				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
				System.out.println("Fecha SQL: " + fechaSQL);

				// Para la hora es Time
				Time timeSQL = new Time(fechaMilis);
				System.out.println("hora SQL: " + timeSQL);

				//
				ps.setDate(7, fechaSQL);
				ps.setTime(8, timeSQL);
				
				ps.executeUpdate();
				System.out.println("Ejecuta insert");

			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
