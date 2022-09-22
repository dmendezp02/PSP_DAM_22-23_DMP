package Ejercicio3Repaso_DMP;

// • Tenga dos atributos private de tipo int (el identificador)
// y de tipo double (la calificación).
// • Tenga un constructor con un parámetro de tipo int.
// • Tenga un getter para cada uno de los atributos.
// • Tenga un setter para la calificación.

public class Asignatura {

	private double identificador;
	private double calificacion;

	public Asignatura() {
	}

	public Asignatura(int identificador) {
		this.identificador = identificador;
	}

	public double getIdentificador() {
		return identificador;
	}

	public void setIdentificador(double d) {
		this.identificador = d;
	}

}
