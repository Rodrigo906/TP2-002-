package Test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import Modelo.Alquiler;
import Modelo.Cliente;
import Modelo.CopiaLibro;
import Modelo.Libro;
import Modelo.LibroRegular;

public class ClienteTest {

	@Test
	public void CalculoDePago() {

		Libro elTunel = new LibroRegular("El Túnel");
		Libro antesDelFin = new LibroRegular("Antes del Fin");

		CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
		CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);

		Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
		Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);

		Cliente yo = new Cliente("Javier");
		yo.alquilar(alquilerElTunel);
		yo.alquilar(alquilerAntesDelFin);

		Object[] resultado = yo.calcularDeudaYPuntosObtenidos();

		Assert.assertEquals(10.0, resultado[0]);
		Assert.assertEquals(2, resultado[1]);

	}

}
