package clases;

public abstract class Gusto {
	
	private static final int CAPACIDAD = 10000;
	private TipoGusto tipoGusto;
	private int id;
	private int total;
	
	public Gusto(TipoGusto tipoGusto, int id) {
		this.setTipoGusto(tipoGusto);
		this.setId(id);
		this.llenarGusto(CAPACIDAD);
	}

	public void setTipoGusto(TipoGusto tipoGusto) {
		this.tipoGusto = tipoGusto;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public TipoGusto getTipoGusto() {
		return tipoGusto;
	}
	
	public int getId() {
		return id;
	}

	

	public int getTotal() {
		return total;
	}
	
	public boolean descontarGramos(int gramosADescontar) {
		boolean seDesconto = false;
		if(this.total >= gramosADescontar) {
			this.total -= gramosADescontar;
			seDesconto = true;
		}
		return seDesconto;
	}
	
	private void llenarGusto(int capacidad) {
		this.total = capacidad;
	}
	
	private String variedad(int id) {
		String variedad = "";
		switch (id) {
		case 0:
			variedad = "comun";
			break;
		case 1:
			variedad = "con crocos de chocolate";
		case 2:
			variedad = "con nueces";
		default:
			break;
		}
		return variedad;
	}
	
	public abstract double calcularRecargo(double precio);

	@Override
	public String toString() {
		return "Gusto [tipoGusto=" + tipoGusto + ", variedad=" + variedad(id) + ", total=" + total + "]";
	}
	
	

}
