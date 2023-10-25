package com.krakedev.conexionbdd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Date - java.util.Date
		//Date - java.sql.Date
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String fechaStr = "2022/10/12 10:45:23";
		try {
			Date fecha = sdf.parse(fechaStr);
			System.out.println(fecha);
			long fechaMilis = fecha.getTime();//me devuelve en milisegundos la fecha 
			System.out.println(fechaMilis);
			
			//crea un java.sqlDate, partiendo de un java.util.Date
			java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
			System.out.println("Fecha SQL: " + fechaSQL);
			
			// Para la hora es Time
			Time timeSQL = new Time(fechaMilis);
			System.out.println("hora SQL: " + timeSQL);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
