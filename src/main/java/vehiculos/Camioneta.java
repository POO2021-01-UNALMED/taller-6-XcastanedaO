package vehiculos;

public class Camioneta extends Vehiculo {
	boolean volco;
	static int totalCamioneta;
	
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas,90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		//totalCamioneta++;
	}
	
	public  int getTotalCamioneta() {
		return totalCamioneta;
	}

	public boolean isVolco() {
		return volco;
	}

}

