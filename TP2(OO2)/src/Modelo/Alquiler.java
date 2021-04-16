package Modelo;

public class Alquiler {

	private CopiaLibro copia;
	private int diasAlquilados;

	public Alquiler(CopiaLibro copia, int diasAlquilados) {
		this.copia = copia;
		this.diasAlquilados = diasAlquilados;
	}

	public double obtenerCalculoMonto() {
		return this.copia.obtenerMonto(this.diasAlquilados);
	}

	public int obtenerCodigoPrecio() {
		return this.copia.obtenerCodigoPrecio();
	}

	public boolean diasAlquiladosMayorQue(int cantidadDias) {
		if (this.diasAlquilados > cantidadDias)
			return true;
		return false;
	}

	public boolean diasAlquiladosIgualQue(int cantidadDias) {
		if (this.diasAlquilados == cantidadDias)
			return true;
		return false;
	}

	public int obtenerPuntosFrecuentes() {
		return this.copia.obtenerPuntosFrecuentes(this.diasAlquilados);
	}

}
