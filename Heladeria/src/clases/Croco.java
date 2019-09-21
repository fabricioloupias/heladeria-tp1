package clases;

public class Croco extends Gusto {
	
	private static final double RECARGO = 1.1;

	public Croco(TipoGusto tipoGusto, int id) {
		super(tipoGusto, id);
	}


	@Override
	public double calcularRecargo(double precio) {
		// TODO Auto-generated method stub
		return precio * RECARGO;
	}

}
