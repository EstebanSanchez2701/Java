package com.krakedev.evaluacion;

public class Telefono {
	private String numero;
	private String tipo;
	private String estado;

	// COSTRUCTOR
	public Telefono(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
		if (numero != null && tipo != null) {
			if (tipo.equalsIgnoreCase("Movil") || tipo.equalsIgnoreCase("Convencional")) {
				if ((tipo.equalsIgnoreCase("Movil") && numero.length() == 10)
						|| tipo.equalsIgnoreCase("Convencional") && numero.length() == 7) {
					this.estado = "C";
				} else {
					this.estado = "E";
				}
			} else {
				this.estado = "E";
			}
		}else {
			this.estado = "E";
		}
	}

	// SOLO GENERAR GETTERS
	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

}
