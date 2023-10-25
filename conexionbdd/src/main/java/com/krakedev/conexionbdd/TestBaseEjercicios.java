package com.krakedev.conexionbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestBaseEjercicios {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"Isabella27");
			System.out.println("Conexion exitosa");
			ps = connection.prepareStatement(
					"insert into empleado(codigo_empleado, nombre, fecha, hora)" + "values(?,?,?,?)");
			ps.setInt(1, 11);
			ps.setString(2, "CARLOS SLIM");

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr = "2022/10/12 12:35:43";
			try {
				Date fecha = sdf.parse(fechaStr);
				long fechaMilis = fecha.getTime();// me devuelve en milisegundos la fecha
				System.out.println(fechaMilis);

				// crea un java.sqlDate, partiendo de un java.util.Date
				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);

				// Para la hora es Time
				Time timeSQL = new Time(fechaMilis);

				//
				ps.setDate(3, fechaSQL);
				ps.setTime(4, timeSQL);

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
