package Modelo;

public class LibroInfantil extends Libro {

	public LibroInfantil(String nombre) {
		super(nombre, 2);
	}

	@Override
	public double calcularDeudaYPuntosObtenidos(int diasAlquilados) {
		int monto = 0;
		monto += 1.5;
		if (diasAlquilados > 3)
			monto += (diasAlquilados - 3) * 1.5;
		return monto;
	}

	@Override
	public int obtenerPuntosFrecuentes(int diasAlquilados) {
		return 0;
	}
}
