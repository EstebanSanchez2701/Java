package com.krakedev.excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercicio2 {
	public void metodo1() {
		String a = null;
		a.substring(0);
	}

	public void metodo2() {
		File f = new File("archivo.txt");
		try {
			f.createNewFile(); // CHECKED IOException
		} catch (IOException io) {
			// TODO: handle exception
			System.out.println("error");
		}

	}

	public void metodo3() throws IOException{
		File f = new File("archivo.txt");
		f.createNewFile(); // CHECKED IOException

	}
}
