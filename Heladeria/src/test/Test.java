package test;

import clases.Contenible;
import clases.Cucurucho;
import clases.Efectivo;
import clases.Heladeria;
import clases.MercadoPago;
import clases.Pagable;
import clases.TipoGusto;
import clases.Vasito;

public class Test {

	public static void main(String[] args) {
		Heladeria heladeria = new Heladeria("Chungo");
		Pagable efectivo = (Pagable) new Efectivo();
		Pagable mercadoPago = (Pagable) new MercadoPago();
		Contenible vasito = (Contenible) new Vasito();
		Contenible cucurucho = (Contenible) new Cucurucho();
		
		/*
		heladeria.venderHelado(TipoGusto.CHOCOLATE, 0, vasito, efectivo);
		heladeria.venderHelado(TipoGusto.CHOCOLATE, 1, cucurucho, mercadoPago);
		*/
		heladeria.venderHelado(TipoGusto.VAINILLA, 2, cucurucho, mercadoPago);
		heladeria.venderHelado(TipoGusto.VAINILLA, 2, vasito, mercadoPago);
		heladeria.venderHelado(TipoGusto.VAINILLA, 2, vasito, efectivo);
		heladeria.mostrarVentas();
	}

}
