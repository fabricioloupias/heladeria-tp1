package clases;

public class Venta {

	private Gusto gusto;
	private double monto;
	private Contenible contenible;
	
	public Venta(Gusto gusto, Contenible contenible, double monto) {
		this.setContenible(contenible);
		this.setGusto(gusto);
		this.setMonto(monto);
	}

	public Gusto getGusto() {
		return gusto;
	}

	public void setGusto(Gusto gusto) {
		this.gusto = gusto;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	public void setContenible(Contenible contenible) {
		this.contenible = contenible;
	}

	@Override
	public String toString() {
		return "Venta [gusto=" + gusto + ", monto=" + monto + ", contenible=" + contenible.mostrate() + "]";
	}

}
