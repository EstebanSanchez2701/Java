package krakedev.entidades;

public class Nota {
	private Materia materia;
	private double calificacion;

	// constructor
	public Nota(Materia materia, double calificacion) {
		this.materia = materia;
		this.calificacion = calificacion;
	}

	public void mostrar() {
		System.out.println("Nota[Materia= " + materia + " Calificiacion: " + calificacion+"]");
	}

	// Getters y setters
	/**
	 * @return the materia
	 */
	public Materia getMateria() {
		return materia;
	}

	/**
	 * @param materia the materia to set
	 */
	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	/**
	 * @return the calificacion
	 */
	public double getCalificacion() {
		return calificacion;
	}

	/**
	 * @param calificacion the calificacion to set
	 */
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

}
