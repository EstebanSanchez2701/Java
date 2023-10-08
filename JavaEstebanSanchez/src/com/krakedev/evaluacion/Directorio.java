package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	String formatoFecha = "yyyy/MM/dd HH:mm:ss";
	SimpleDateFormat sdf = new SimpleDateFormat(formatoFecha);
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;
	
	
	// COnstructor
	public Directorio() {
		this.contactos = new ArrayList<Contacto>();
		this.correctos = new ArrayList<Contacto>();
		this.incorrectos = new ArrayList<Contacto>();
		
		this.fechaModificacion = new Date();
		Contacto elementoContacto;
		Contacto contactoEncontrado;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			contactoEncontrado = buscarPorCedula(elementoContacto.getCedula());
			if (contactoEncontrado == null) {
				agregarContacto(contactoEncontrado);
			} else {
				System.out.println("Cliente ya existe");
			}
		}

	}

	public boolean agregarContacto(Contacto contacto) {
		boolean respuesta = false;
		Contacto encontrado;
		encontrado = buscarPorCedula(contacto.getCedula());

		if (encontrado != null) {
			System.out.println("Cliente ya existe!");
		} else {
			contactos.add(contacto);
			respuesta = true;
		}
		return respuesta;

	}

	public Contacto buscarPorCedula(String cedula) {
		Contacto elementoContacto;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			if (elementoContacto != null && elementoContacto.getCedula().equals(cedula)) {
				return elementoContacto;
			}
		}
		return null;
	}

	public String consultarUltimaModificacion() {
		String fechaModificacion;
		fechaModificacion = sdf.format(getFechaModificacion());
		return fechaModificacion;
	}

	public int contarPerdidos() {
		ArrayList<Contacto> perdidos = new ArrayList<Contacto>();
		Contacto elementoContacto;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			if (elementoContacto.getDireccion() == null) {
				perdidos.add(elementoContacto);
			}
		}
		return perdidos.size();
	}

	public int contarFijos() {
		int fijos = 0;
		Contacto elementoContacto;
		Telefono elementoTelefono;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			for (int j = 0; j < elementoContacto.getTelefonos().size(); j++) {
				elementoTelefono = elementoContacto.getTelefonos().get(j);
				if (elementoTelefono.getTipo().equalsIgnoreCase("Convencional")
						&& elementoTelefono.getEstado().equalsIgnoreCase("C")) {
					fijos += 1;
				} else {
					fijos += 0;
				}
			}
		}
		return fijos;
	}
	
	public void depurar() {
		Contacto elementoContacto;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			if (elementoContacto.getDireccion() == null) {
				incorrectos.add(elementoContacto);
			}else {
				correctos.add(elementoContacto);
			}
		}
		contactos.clear();
	}

	/**
	 * @return the contactos
	 */
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	/**
	 * @param contactos the contactos to set
	 */
	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	/**
	 * @return the fechaModificacion
	 */
	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	/**
	 * @param fechaModificacion the fechaModificacion to set
	 */
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	/**
	 * @return the correctos
	 */
	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	/**
	 * @param correctos the correctos to set
	 */
	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	/**
	 * @return the incorrectos
	 */
	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	/**
	 * @param incorrectos the incorrectos to set
	 */
	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

	
}
