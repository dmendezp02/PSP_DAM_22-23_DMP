package Ejercicio3Repaso_DMP;

// • Tenga tres atributos private de tipo Asignatura.
// • Tenga un constructor con tres parámetros de tipo Asignatura 
// que inicialice los tres atributos.
// • Tenga un constructor con tres parámetros de tipo int que 
// inicialice los tres atributos.
// • Tenga un getter para cada uno de los atributos.

public class Alumno {

	private Asignatura asignatura;
	private Asignatura asignatura2;
	private Asignatura asignatura3;

	public Alumno() {
	}

	public Alumno(Asignatura asignatura, Asignatura asignatura2, Asignatura asignatura3) {
		this.asignatura = asignatura;
		this.asignatura2 = asignatura2;
		this.asignatura3 = asignatura3;
	}

	public Alumno(int a1, int a2, int a3) {
		this.asignatura = new Asignatura(a1);
		this.asignatura2 = new Asignatura(a2);
		this.asignatura3 = new Asignatura(a3);
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public Asignatura getAsignatura2() {
		return asignatura2;
	}

	public Asignatura getAsignatura3() {
		return asignatura3;
	}

}
