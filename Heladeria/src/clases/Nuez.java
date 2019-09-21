package clases;

public class Nuez extends Gusto {
	
	private static final double RECARGO = 1.2;

	public Nuez(TipoGusto tipoGusto, int id) {
		super(tipoGusto, id);
	}

	@Override
	public double calcularRecargo(double precio) {
		double total = precio * RECARGO;
		return total;
	}

}
