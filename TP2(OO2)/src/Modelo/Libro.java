package Modelo;

public class Libro {

	private String nombre;
	private int codigoPrecio;

	public Libro(String nombre, int priceCode) {
		this.nombre = nombre;
		this.codigoPrecio = priceCode;
	}

	public int codigoPrecio() {
		return codigoPrecio;
	}

	public String nombre() {
		return nombre;
	}

	public double calcularDeudaYPuntosObtenidos(int diasAlquilados) {
		return 0.0;
	}

	public int obtenerPuntosFrecuentes(int diasAlquilados) {
		return 0;
	}
}
