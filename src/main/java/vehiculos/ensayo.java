package vehiculos;

public class ensayo {

	public static void main(String[] args) {
		Pais p = new Pais("Colombia");
		/*Pais p1 = new Pais("Ecuador");
		Pais p2 = new Pais("USA");
		Pais p3 = new Pais("Canada");
		
		Fabricante f1 = new Fabricante("Renault", p1);
		Fabricante f2 = new Fabricante("Chevrolet", p1);
		Fabricante f3 = new Fabricante("Tesla", p2);
		Fabricante f4 = new Fabricante("Volvo", p3);
		
		Camion m = new Camion("SS", "Camion premium", 1000, 100, f1, 3);
		Camion no = new Camion("AA", "Camion", 1000, 100, f1, 3);
		Automovil dfs = new Automovil("NN", "Mac 100", 820, 20, f1, 4);
		Camioneta fdb = new Camioneta("CC", 5, "Ford", 500, 150, f1, true);
		Camioneta ol = new Camioneta("CC", 5, "Ford", 500, 150, f1, true);
		Automovil fs = new Automovil("NN", "Mac 100", 820, 20, f2, 4);
		Camioneta fh =  new Camioneta("CC", 5, "Ford", 500, 150, f2, true);
		
		Camion q = new Camion("SS", "Camion premium", 1000, 100, f3, 3);
		Camion l =new Camion("AA", "Camion", 1000, 100, f3, 3);
		Automovil s =new Automovil("NN", "Mac 100", 820, 20, f3, 4);
		
		Camioneta x = new Camioneta("CC", 5, "Ford", 500, 150, f4, true);
		Automovil o =new Automovil("NN", "Mac 100", 820, 20, f4, 4);*/
		
		//kgvk
		Fabricante f = new Fabricante("Renault", p);
		Camion c1 =  new Camion("SS", "Camion premium", 1000, 100, f, 3);
		Camion c2 =  new Camion("AA", "Camion", 1000, 100, f, 3);
		Automovil a1 =  new Automovil("NN", "Mac 100", 820, 20, f, 4);
		Camioneta ca1 =  new Camioneta("CC", 5, "Ford", 500, 150, f, true);
		
		System.out.println(Vehiculo.cantVehiculos);
		
		

	}

}
