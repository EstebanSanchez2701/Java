package com.clearminds.maquina;

import com.clearminds.componente.Celda;
import com.clearminds.componente.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	//COSNTRUCTOR
	public MaquinaDulces() {
		
	}
	
	// METODOS
	public void configurarMaquina(String cod1, String cod2, String cod3, String cod4) {
		celda1 = new Celda(cod1);
		celda2 = new Celda(cod2);
		celda3 = new Celda(cod3);
		celda4 = new Celda(cod4);
	}

	public void mostrarConfiguracion() {
		System.out.println("CELDA 1: " + celda1.getCodigo());
		System.out.println("CELDA 2: " + celda2.getCodigo());
		System.out.println("CELDA 3: " + celda3.getCodigo());
		System.out.println("CELDA 4: " + celda4.getCodigo());
		System.out.println("Saldo; " + saldo);
	}

	public Celda buscarCelda(String codigo) {
		if (celda1.getCodigo() == codigo) {
			return celda1;
		} else if (celda2.getCodigo() == codigo) {
			return celda2;
		} else if (celda3.getCodigo() == codigo) {
			return celda3;
		} else {
			return celda4;
		}
	}

	public void cargarProducto(Producto producto, String codigo, int cantidad) {
		Celda celdaRecuperada;
		celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, cantidad);
	}

	public void mostrarProductos() {
		if(celda1.getProducto() != null) {
			System.out.println("************CELDA: "+celda1.getCodigo());
			System.out.println("STOCK:"+celda1.getStock());
			System.out.println("Nombre Producto:"+celda1.getProducto().getNombre());
			System.out.println("El precio del Producto es: "+celda1.getProducto().getPrecio());
			System.out.println("El codigo es: "+celda1.getProducto().getCodigo());
		}else {
			System.out.println("************CELDA: "+celda1.getCodigo());
			System.out.println("STOCK: 0");
			System.out.println("La Celda 1 no tiene productos!!");	
		}

		if(celda2.getProducto() != null) {
			System.out.println("************CELDA: "+celda2.getCodigo());
			System.out.println("STOCK:"+celda2.getStock());
			System.out.println("Nombre Producto:"+celda2.getProducto().getNombre());
			System.out.println("El precio del Producto es: "+celda2.getProducto().getPrecio());
			System.out.println("El codigo es: "+celda2.getProducto().getCodigo());
		}else {
			System.out.println("************CELDA: "+celda2.getCodigo());
			System.out.println("STOCK: 0");
			System.out.println("La Celda 2 no tiene productos!!");	
		}
		if(celda3.getProducto() != null) {
			System.out.println("************CELDA: "+celda3.getCodigo());
			System.out.println("STOCK:"+celda3.getStock());
			System.out.println("Nombre Producto:"+celda3.getProducto().getNombre());
			System.out.println("El precio del Producto es: "+celda3.getProducto().getPrecio());
			System.out.println("El codigo es: "+celda3.getProducto().getCodigo());
		}else {
			System.out.println("************CELDA: "+celda3.getCodigo());
			System.out.println("STOCK: 0");
			System.out.println("La Celda 3 no tiene productos!!");	
		}
		if(celda4.getProducto() != null) {
			System.out.println("************CELDA: "+celda4.getCodigo());
			System.out.println("STOCK:"+celda4.getStock());
			System.out.println("Nombre Producto:"+celda4.getProducto().getNombre());
			System.out.println("El precio del Producto es: "+celda4.getProducto().getPrecio());
			System.out.println("El codigo es: "+celda4.getProducto().getCodigo());
		}else {
			System.out.println("************CELDA: "+celda4.getCodigo());
			System.out.println("STOCK: 0");
			System.out.println("La Celda 4 no tiene productos!!");	
		}
		System.out.println("Saldo: "+saldo);

	}

	public Producto buscarProductoEnCelda(String codigo) {
		Celda resultado;
		resultado = buscarCelda(codigo);
		if (resultado.getProducto() == null) {
			return null;
		} else {
			return resultado.getProducto();
		}
	}

	public double consultarPrecio(String codigo) {
		Celda resultado;
		resultado = buscarCelda(codigo);
		return resultado.getProducto().getPrecio();
	}

	public Celda buscarCeldaProducto(String codigo) {
		if (celda1.getProducto()!= null && celda1.getProducto().getCodigo() == codigo) {
			return celda1;
		} else if (celda2.getProducto()!= null && celda2.getProducto().getCodigo() == codigo) {
			return celda2;
		} else if (celda3.getProducto()!= null && celda3.getProducto().getCodigo() == codigo) {
			return celda3;
		} else {
			return celda4;
		}
	}

	public void incrementarProductos(String codigo, int cantidad) {
		Celda celdaEncontrada;
		int stock;
		celdaEncontrada = buscarCeldaProducto(codigo);
		stock = celdaEncontrada.getStock();
		celdaEncontrada.setStock(stock + cantidad);
	}

	public void vender(String codigo) {
		Celda resultado;
		int stock;
		resultado = buscarCelda(codigo);
		stock = resultado.getStock() - 1;
		resultado.setStock(stock);
		saldo = saldo + resultado.getProducto().getPrecio();

	}

	public double venderConCambio(String codigo, double valor) {
		double cambio;
		Celda resultado;
		int stock;
		resultado = buscarCelda(codigo);
		stock = resultado.getStock() - 1;
		resultado.setStock(stock);
		saldo = saldo + resultado.getProducto().getPrecio();
		cambio = valor - resultado.getProducto().getPrecio();
		return cambio;
	}

	
	//getters and setters
	/**
	 * @return the celda1
	 */
	public Celda getCelda1() {
		return celda1;
	}

	/**
	 * @param celda1 the celda1 to set
	 */
	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	/**
	 * @return the celda2
	 */
	public Celda getCelda2() {
		return celda2;
	}

	/**
	 * @param celda2 the celda2 to set
	 */
	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	/**
	 * @return the celda3
	 */
	public Celda getCelda3() {
		return celda3;
	}

	/**
	 * @param celda3 the celda3 to set
	 */
	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	/**
	 * @return the celda4
	 */
	public Celda getCelda4() {
		return celda4;
	}

	/**
	 * @param celda4 the celda4 to set
	 */
	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
}
