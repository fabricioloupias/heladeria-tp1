package clases;

class Normal extends Gusto {
	
	private static final double RECARGO = 1;
	
	public Normal(TipoGusto tipoGusto, int id) {
		super(tipoGusto, id);
	}

	
	@Override
	public double calcularRecargo(double precio){
		// TODO Auto-generated method stub
		return precio * RECARGO;
	}

}
