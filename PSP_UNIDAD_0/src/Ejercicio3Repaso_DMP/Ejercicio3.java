package Ejercicio3Repaso_DMP;

public class Ejercicio3 {

// • Cree e inicialice tres Asignaturas.
// • Cree un Alumno con las tres Asignaturas.
// • Cree un Profesor que le ponga calificaciones al Alumno y
// muestre por pantalla la media del Alumno.

	public static void main(String[] args) {
		
		Asignatura a1 = new Asignatura(1);
		Asignatura a2 = new Asignatura(2);
		Asignatura a3 = new Asignatura(3);

		Alumno alumno1 = new Alumno(a1, a2, a3);
		
		Profesor p1 = new Profesor();
		
		p1.ponerNotas(alumno1);
		
		System.out.println("\nLa media del alumno 1 es: " +p1.calcularMedia(alumno1));
	}

}
