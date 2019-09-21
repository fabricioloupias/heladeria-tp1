package clases;

class Normal extends Gusto {
	
	private static final double RECARGO = 1;
	private TipoGusto tipoGusto;
	private int id;

	public Normal(TipoGusto tipoGusto, int id) {
		super(tipoGusto, id);
	}

	public TipoGusto getTipoGusto() {
		return tipoGusto;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public double calcularRecargo(double precio){
		// TODO Auto-generated method stub
		return precio * RECARGO;
	}

}
