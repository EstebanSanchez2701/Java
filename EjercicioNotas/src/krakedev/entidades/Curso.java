package krakedev.entidades;

import java.util.ArrayList;

public class Curso {

	ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

	public Estudiante buscarEstudiantePorCedula(Estudiante estudiante) {
		Estudiante elementoEstudiante = null;
		for (int i = 0; i < estudiantes.size(); i++) {
			elementoEstudiante = estudiantes.get(i);
			if (estudiante.getCedula().equals(elementoEstudiante.getCedula())) {
				System.out.println("El estudiante si se encuentra en un curso");
				return elementoEstudiante;
			}
		}
		return null;
	}

	public void matricularEstudiante(Estudiante estudiante) {
		Estudiante estudianteEncontrado = buscarEstudiantePorCedula(estudiante);
		if (estudianteEncontrado != null) {
			System.out.println(
					"El estudiante con cedula: " + estudianteEncontrado.getCedula() + "ya se encuentra en la lista");
		} else {
			estudiantes.add(estudiante);
			System.out.println("Estudiante matriculado");
		}

	}

	public double calcularPromedioCurso() {
		Estudiante elementoEstudiante = null;
		double promedio = 0.0;
		if (estudiantes.size() == 0) {
			return 0.0;
		}
		for (int i = 0; i < estudiantes.size(); i++) {
			elementoEstudiante = estudiantes.get(i);
			promedio += elementoEstudiante.calcularPromedioNotasEstudiante();
		}
		return promedio / estudiantes.size();
	}

	public void mostrar() {
		Estudiante elementoEstudiante;
		for (int i = 0; i < estudiantes.size(); i++) {
			elementoEstudiante = estudiantes.get(i);
			System.out.println("Clase Curso [Nombre: " + elementoEstudiante.getNombre() + " Apellido: "
					+ elementoEstudiante.getApellido() + " Cedula: " + elementoEstudiante.getCedula());
		}
	}

	/**
	 * @return the estudiantes
	 */
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	/**
	 * @param estudiantes the estudiantes to set
	 */
	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	
}
