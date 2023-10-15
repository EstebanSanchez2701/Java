package com.cmc.evaluacion;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public Cliente buscarCliente(String cedula) {
		Cliente elementoCliente = null;
		for (int i = 0; i < clientes.size(); i++) {
			elementoCliente = clientes.get(i);
			if (cedula.equals(elementoCliente.getCedula())) {
				return elementoCliente;
			}
		}
		return null;
	}

	public void registrarCliente(Cliente cliente) {
		Cliente clienteEncontrado = buscarCliente(cliente.getCedula());
		if (clienteEncontrado != null) {
			// System.out.println("Si existe no registra");
		} else {
			clientes.add(cliente);
			// System.out.println("No existe si registrado");
		}

	}

	public void mostrar() {
		Cliente elementoCliente;
		for (int i = 0; i < clientes.size(); i++) {
			elementoCliente = clientes.get(i);
			if (elementoCliente != null) {
				System.out.println("Cliente registrado: " + elementoCliente.getNombre() + " "
						+ elementoCliente.getApellido() + " [cedula: " + elementoCliente.getCedula() + ", nombre = "
						+ elementoCliente.getNombre() + ", apellido = " + elementoCliente.getApellido());
			}
			System.out.println("Cliente ya existe: " + elementoCliente.getCedula());
		}
	}

	public void asignarPrestamo(String cedula, Prestamo prestamo) {
		Cliente clienteEncontrado = buscarCliente(cedula);
		if (clienteEncontrado != null) {
			prestamos.add(prestamo);
			CalculadoraAmortizacion amortizacion = new CalculadoraAmortizacion();
			amortizacion.generarTabla(prestamo);
		} else {
			System.out.println("No es cliente del Banco");
		}
	}

	public ArrayList<Prestamo> buscarPrestamos(String cedula) {
		Cliente clienteEncontrado = buscarCliente(cedula);
		if (clienteEncontrado != null) {
			return prestamos;
		} else {
			return null;
		}
	}



	// Getters and Setters
	/**
	 * @return the prestamos
	 */
	public final ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	/**
	 * @param prestamos the prestamos to set
	 */
	public final void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	/**
	 * @return the clientes
	 */
	public final ArrayList<Cliente> getClientes() {
		return clientes;
	}

	/**
	 * @param clientes the clientes to set
	 */
	public final void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

}
