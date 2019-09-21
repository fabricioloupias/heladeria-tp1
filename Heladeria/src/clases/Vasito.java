package clases;

public class Vasito implements Contenible{
	
	private static final int CAPACIDAD_GRAMOS = 200;
	private static final int COSTO = 10;
	private static final String NOMBRE_MOSTRABLE = "Vasito";
	
	@Override
	public int getCapacidad() {
		return CAPACIDAD_GRAMOS;
	}

	@Override
	public int getCosto() {
		// TODO Auto-generated method stub
		return COSTO;
	}

	@Override
	public String mostrate() {
		return NOMBRE_MOSTRABLE;
	}

}
