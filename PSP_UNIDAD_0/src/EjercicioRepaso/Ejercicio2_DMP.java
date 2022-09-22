package EjercicioRepaso;

import java.util.Scanner;

public class Ejercicio2_DMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner(System.in);
	System.out.println("Introduce un número: ");
	int num = teclado.nextInt();
	
	for(int i = 0; i <= num; i++) {
		num += 1;
	}
	
	System.out.println("La suma de los números del 1 al 100 es: " +num);
	}

}
