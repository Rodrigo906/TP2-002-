package Modelo;

public class LibroRegular extends Libro {

	public LibroRegular(String nombre) {
		super(nombre, 0);
	}

	@Override
	public double calcularDeudaYPuntosObtenidos(int diasAlquilados) {
		double monto = 0;
		monto += 2;
		if (diasAlquilados > 2)
			monto += (diasAlquilados - 2) * 1.5;
		return monto;
	}

	@Override
	public int obtenerPuntosFrecuentes(int diasAlquilados) {
		return 0;
	}
}
