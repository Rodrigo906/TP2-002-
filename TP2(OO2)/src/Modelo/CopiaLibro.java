package Modelo;

public class CopiaLibro {

	private Libro libro;

	public CopiaLibro(Libro libro) {
		this.libro = libro;
	}

	public double obtenerMonto(int diasAlquilados) {
		return libro.calcularDeudaYPuntosObtenidos(diasAlquilados);
	}

	public int obtenerCodigoPrecio() {
		return this.libro.codigoPrecio();
	}

	public int obtenerPuntosFrecuentes(int diasAlquilados) {
		return this.libro.obtenerPuntosFrecuentes(diasAlquilados);
	}
}
