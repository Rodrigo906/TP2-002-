package Modelo;

public class LibroNuevoLanzamiento extends Libro {

	public LibroNuevoLanzamiento(String nombre) {
		super(nombre, 1);
	}

	@Override
	public double calcularDeudaYPuntosObtenidos(int diasAlquilados) {
		int monto = 0;
		monto += diasAlquilados * 3;
		return monto;
	}

	@Override
	public int obtenerPuntosFrecuentes(int diasAlquilados) {
		if (diasAlquilados > 1) {
			return 1;
		}
		return 0;
	}
}
