package EjercicioRepaso;

import java.util.Scanner;

public class Ejercicio1_DMP {

	public static void main(String[] args) {

	System.out.println("Introduce el número del que se quiere calcular el factorial");
	int num = new Scanner(System.in).nextInt();
	int factorial = 1;
	
	for(int i = num; i > 0 ;i--){
		factorial = factorial*i;
	}
	
	System.out.println("El factorial del número " +num+ " es: " +factorial);
	}
}
