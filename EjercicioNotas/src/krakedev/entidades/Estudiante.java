package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	ArrayList<Nota> notas;

	public Estudiante(String cedula, String nombre, String apellido) {
		notas = new ArrayList<Nota>();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public void agregarNota(Nota nuevaNota) {
		Nota elementoNota = null;
		if (nuevaNota.getCalificacion() >= 0.0 && nuevaNota.getCalificacion() <= 10.0) {
			for (int i = 0; i < notas.size(); i++) {
				elementoNota = notas.get(i);
				if (elementoNota.getMateria().getCodigo().equals(nuevaNota.getMateria().getCodigo())) {

					System.out.println("Nota ya existe con el nombre materia:" + nuevaNota.getMateria().getNombre());
					return;
				}
			}
			notas.add(nuevaNota);
			System.out.println("Nueva nota añadida correctamente.");

		} else {
			System.out.println("No se agrega la nota porque no esta entre 0 y 10");
		}
	}

	public void modificarNota(String codigo, double nuevaNota) {
		Nota elementoNota = null;
		if (nuevaNota >= 0.0 && nuevaNota <= 10.0) {
			for (int i = 0; i < notas.size(); i++) {
				elementoNota = notas.get(i);
				if (codigo.equals(elementoNota.getMateria().getCodigo())) {
					elementoNota.setCalificacion(nuevaNota);
					System.out.println("Se actualiza nota en materia: " + elementoNota.getMateria().getNombre());
					return;
				} else {
					System.out.println("no encontro el codigo de la materia");
				}
			}
		} else {
			System.out.println("No se agrega la nota porque no esta entre 0 y 10");
		}

	}

	public double calcularPromedioNotasEstudiante() {
		// calcular el promedio de un estudiante se debe barrer el arraylis
		Nota elementoNota = null;
		double promedio = 0.0;
		if (notas.size() == 0) {
			return 0.0;
		}
		for (int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			promedio += elementoNota.getCalificacion();
		}
		return promedio / notas.size();
	}

	public void mostrar() {
		Nota elementoNota;
		for (int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			System.out.println("Clase Estudiante [Nombre: " + nombre + " Apellido: " + apellido + " Cedula: " + cedula
					+ " Cod Materia: " + elementoNota.getMateria().getCodigo() + " Nombre Materia: "
					+ elementoNota.getMateria().getNombre() + " Calificación: " + elementoNota.getCalificacion());
		}
	}

	// getters y setters
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}

	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

}
