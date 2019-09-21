package clases;

public class Cucurucho implements Contenible{
	
	private static final int CAPACIDAD_GRAMOS = 400;
	private static final int COSTO = 10;
	private static final String NOMBRE_MOSTRABLE = "Cucurucho";
	
	@Override
	public int getCapacidad() {
		// TODO Auto-generated method stub
		return CAPACIDAD_GRAMOS;
	}

	@Override
	public int getCosto() {
		// TODO Auto-generated method stub
		return COSTO;
	}

	@Override
	public String mostrate() {
		// TODO Auto-generated method stub
		return NOMBRE_MOSTRABLE;
	}
	
}
