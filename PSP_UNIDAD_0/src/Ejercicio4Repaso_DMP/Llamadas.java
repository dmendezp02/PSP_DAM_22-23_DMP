package Ejercicio4Repaso_DMP;

public abstract class Llamadas {

	private String numOrigen;
	private String numDestino;
	protected int duracion;
	private String nombre;
	private int costeTotal;

	public abstract double calcularCosteTotal();
	
	public Llamadas() {
	}

	public Llamadas(String numOrigen, String numDestino, int duracion) {
		this.numOrigen = numOrigen;
		this.numDestino = numDestino;
		this.duracion = duracion;
	}

	public String getNumOrigen() {
		return numOrigen;
	}

	public void setNumOrigen(String numOrigen) {
		this.numOrigen = numOrigen;
	}

	public String getNumDestino() {
		return numDestino;
	}

	public void setNumDestino(String numDestino) {
		this.numDestino = numDestino;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

}
