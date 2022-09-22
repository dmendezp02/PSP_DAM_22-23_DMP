package Ejercicio3Repaso_DMP;

// • Tenga un método ponerNotas que recibe un parámetro de tipo Alumno 
// y que no devuelve nada. Pondrá una calificación aleatoria a 
// cada una de las asignaturas del alumno.
// • Tenga un método calcularMedia que recibe un parámetro de tipo 
// Alumno y devuelve un double.

public class Profesor {

	public void ponerNotas(Alumno a1) {

		a1.getAsignatura().setIdentificador(Math.random() * 10 + 1);
		a1.getAsignatura2().setIdentificador(Math.random() * 10 + 1);
		a1.getAsignatura3().setIdentificador(Math.random() * 10 + 1);

	}

	public double calcularMedia(Alumno a1) {

		double media = (a1.getAsignatura().getIdentificador() + a1.getAsignatura2().getIdentificador() + a1.getAsignatura3().getIdentificador()) / 3;

		return media;
	}
}
