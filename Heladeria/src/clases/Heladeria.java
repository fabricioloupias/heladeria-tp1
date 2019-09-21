package clases;

import java.util.ArrayList;

public class Heladeria {

	private static final int TOTAL_GUSTOS = 3;
	private static final int TOTAL_VARIEDAD = 3;
	private static final int STOCK_VASITOS = 10;
	private static final int STOCK_CUCURUCHOS = 10;
	private static final double PRECIO_POR_KILO = 300;
	private String nombre;
	private Gusto[][] tachos;
	private int totalVasitos;
	private int totalCucuruchos;
	private ArrayList<Venta> ventas;

	public Heladeria(String nombre) {
		this.setNombre(nombre);
		this.llenarTachos(TOTAL_GUSTOS, TOTAL_VARIEDAD);
		this.llenarStock(STOCK_VASITOS, STOCK_CUCURUCHOS);
		this.ventas = new ArrayList<Venta>();
		
		Gusto gusto0 = new Normal(TipoGusto.VAINILLA, 0);
		Gusto gusto1 = new Normal(TipoGusto.VAINILLA, 1);
		Gusto gusto2 = new Normal(TipoGusto.VAINILLA, 2);
		
		Gusto gusto3 = new Croco(TipoGusto.FRUTILLA, 0);
		Gusto gusto4 = new Croco(TipoGusto.FRUTILLA, 1);
		Gusto gusto5 = new Croco(TipoGusto.FRUTILLA, 2);
		
		Gusto gusto6 = new Nuez(TipoGusto.CHOCOLATE, 0);
		Gusto gusto7 = new Nuez(TipoGusto.CHOCOLATE, 1);
		Gusto gusto8 = new Nuez(TipoGusto.CHOCOLATE, 2);
		
		tachos[0][0] = gusto0;
		tachos[0][1] = gusto1;
		tachos[0][2] = gusto2;
		
		tachos[1][0] = gusto3;
		tachos[1][1] = gusto4;
		tachos[1][2] = gusto5;
		
		tachos[2][0] = gusto6;
		tachos[2][1] = gusto7;
		tachos[2][2] = gusto8;
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getTotalVasitos() {
		return totalVasitos;
	}


	public int getTotalCucuruchos() {
		return totalCucuruchos;
	}

	public void setTachos(Gusto[][] tachos) {
		this.tachos = tachos;
	}


	public void venderHelado(TipoGusto tipoGusto, int variedad, Contenible contenible, Pagable pagable) {
		int idxGusto = tipoGusto.ordinal();
		int idxVariedad = variedad;
		int gramosElegidos = contenible.getCapacidad();
		int costoContenible = contenible.getCosto();
		boolean hayStock = this.hayStock(contenible);
		Gusto gusto = this.buscarGusto(idxGusto, idxVariedad);
		double precio;
		double precioPorGusto;
		double precioTotal;
		
		if(gusto.descontarGramos(gramosElegidos) && hayStock) {
			precio = ((gramosElegidos * PRECIO_POR_KILO) / 1000) + costoContenible;
			precioPorGusto = gusto.calcularRecargo(precio);
			precioTotal = pagable.calcularDescuento(precioPorGusto);
			this.registrarVenta(gusto, contenible, precioTotal);
			
			System.out.println("El monto a pagar es de: " + precioTotal);
		}else {
			System.out.println("No se dispone de tal capacidad");
		}
		
	}
	
	public Gusto buscarGusto(int tipoGusto, int idxGusto) {
		return tachos[tipoGusto][idxGusto];
	}
	
	public void registrarVenta(Gusto gusto, Contenible contenible, double monto) {
		Venta venta = new Venta(gusto, contenible, monto);
		this.ventas.add(venta);
	}
	
	public boolean hayStock(Contenible contenible) {
		if(contenible instanceof Vasito) {
			return this.getTotalVasitos() > 0;
		}else {
			return this.getTotalCucuruchos() > 0;
		}
	}
	
	private void llenarTachos(int totalGustos, int totalVariedad) {
		this.setTachos(new Gusto[totalGustos][totalVariedad]);
	}
	
	private void llenarStock(int totalVasitos, int totalCucuruchos) {
		this.totalVasitos = 10;
		this.totalCucuruchos = 10;
	}

	public void mostrarVentas() {
		for (Venta venta : ventas) {
			System.out.println(venta);
		}
	}
	

}
