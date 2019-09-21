package clases;

public class MercadoPago implements Pagable{
	private static final double DESCUENTO = 10;

	@Override
	public double calcularDescuento(double precio) {
		return precio - DESCUENTO;
	}
}
