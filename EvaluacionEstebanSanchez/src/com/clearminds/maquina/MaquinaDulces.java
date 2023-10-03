package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	ArrayList<Celda> celdas;
	double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}

	public void agregarCelda(String codigo) {
		Celda c1 = new Celda(codigo);
		celdas.add(c1);
	}

	public void configurarMaquina(String cod1, String cod2, String cod3, String cod4) {
		agregarCelda(cod1);
		agregarCelda(cod2);
		agregarCelda(cod3);
		agregarCelda(cod4);
	}

	public void mostrarConfiguracion() {
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			System.out.println("codigo celda: " + elementoCelda.getCodigo());
		}
	}

	public Celda buscarCelda(String codigo) {
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (codigo.equals(elementoCelda.getCodigo())) {
				return elementoCelda;
			}
		}
		return null;
	}

	public void cargarProducto(Producto producto, String codigo, int cantidad) {
		Celda celdaRecuperada;
		celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, cantidad);
	}

	public void mostrarProductos() {
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (elementoCelda.getProducto() == null) {
				System.out.println("Celda:" + elementoCelda.getCodigo() + " Stock:0" + " Sin Producto asignado");
			} else {
				System.out.println("Celda:" + elementoCelda.getCodigo() + " Stock: " + elementoCelda.getStock()
						+ " Producto: " + elementoCelda.getProducto().getNombre() + " Precio:"
						+ elementoCelda.getProducto().getPrecio());
			}
		}
		System.out.println("Saldo: " + saldo);
	}

	public Producto buscarProductoEnCelda(String codigo) {
		Celda celdaEncontrada;
		celdaEncontrada = buscarCelda(codigo);
		return celdaEncontrada.getProducto();
	}

	public double consultarPrecio(String codigo) {
		Celda celdaEncontrada;
		celdaEncontrada = buscarCelda(codigo);
		return celdaEncontrada.getProducto().getPrecio();
	}

	public Celda buscarCeldaProducto(String codigo) {
		Celda celdaEncontrada;
		for (int i = 0; i < celdas.size(); i++) {
			celdaEncontrada = celdas.get(i);
			if (celdaEncontrada.getProducto() != null && codigo.equals(celdaEncontrada.getProducto().getCodigo())) {
				return celdaEncontrada;
			}
		}
		return null;
	}

	public void incrementarProductos(String codigo, int cantidad) {
		Celda celdaEncontrada;
		int stockActual;
		celdaEncontrada = buscarCeldaProducto(codigo);

		if (celdaEncontrada.getProducto() != null && codigo.equals(celdaEncontrada.getProducto().getCodigo())) {
			stockActual = celdaEncontrada.getStock();
			celdaEncontrada.setStock(stockActual + cantidad);
		}
	}

	public void vender(String codigo) {
		Celda celdaEncontrada;
		int stock;
		celdaEncontrada = buscarCelda(codigo);
		stock = celdaEncontrada.getStock();
		celdaEncontrada.setStock(stock - 1);
		if (celdaEncontrada.getProducto() != null) {
			saldo = saldo + celdaEncontrada.getProducto().getPrecio();
		}
	}

	public double venderConCambio(String codigo, double valor) {
		double cambio;
		Celda celdaEncontrada;
		int stock;
		celdaEncontrada = buscarCelda(codigo);
		stock = celdaEncontrada.getStock() - 1;
		celdaEncontrada.setStock(stock);
		saldo = saldo + celdaEncontrada.getProducto().getPrecio();
		cambio = valor - celdaEncontrada.getProducto().getPrecio();
		return cambio;
	}

	public void mostrarProductoCelda(String codigo) {
		Celda celdaEncontrada;
		celdaEncontrada = buscarCelda(codigo);
		System.out.println("codigo: " + celdaEncontrada.getCodigo());
	}

	public ArrayList<Producto> buscarMenores(double limite) {
		ArrayList<Producto> menores = new ArrayList<Producto>();
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (elementoCelda.getProducto().getPrecio() < limite) {
				menores.add(elementoCelda.getProducto());
			}
		}
		return menores;
	}
}
