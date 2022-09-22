package Ejercicio4Repaso_DMP;

public class Locales extends Llamadas {

	private static final double PRECIO = 0.15;
	
    public double calcularCosteTotal() {
    	
    	return PRECIO*duracion;
    	
    }

}
