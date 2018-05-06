package datos;

import java.util.Scanner;

public class Clientes {

	private static Scanner sc = new Scanner(System.in);
	private String DNI;
	private String nombre;
	private int numPeticion;
	
	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Clientes(String dNI, String nombre) {
		super();
		this.DNI = dNI;
		this.nombre = nombre;
	}
	
	public void peticion(materiales[] tabla) {
		String a;
		int id=-1;
		
		if(numPeticion < 5) {
			do {
			try {
			for (int i = 0; i < tabla.length; i++) {
				System.out.println(i+1 + " --> " +tabla[i].getTitulo());
			}
			System.out.println("Dime el id de lo que quieras alquilar");
			a = sc.next();
			id = Integer.parseInt(a);
			id--;
			numPeticion--;
			System.out.println("Ole ya tienes tu producto alquilado");
			}catch (Exception e) {
				System.out.println("No has introducido un número");
			}
			}while(id == -1);		
					
				
					
				
					
					
					
					
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
