package clases;

public class Efectivo implements Pagable{
	private static final double DESCUENTO = 0.9;

	@Override
	public double calcularDescuento(double precio) {
		// TODO Auto-generated method stub
		return precio * DESCUENTO;
	}
}
