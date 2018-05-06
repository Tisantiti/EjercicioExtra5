package main;

import datos.Clientes;
import datos.Discos;
import datos.Libros;
import datos.materiales;

public class Principal {

	public static void main(String[] args) {
		
		Discos d1 = new Discos("musiquita", "245", "Don omar", "Don omar","hola hola");
		Discos d2 = new Discos("musiquita", "2745", "Bad Bunny", "Bad Bunny","hola hola");
		Libros l1 = new Libros("dvkor", "gtrtb", "dfgbb", "ggbtb", 566);
		
		materiales[] tabla = new materiales[3];
		
		tabla[0]=d1;
		tabla[1]=d2;
		tabla[2]=l1;
		
		materiales m;
		Clientes c = new Clientes("445664354A", "Santi Pérez");
		
		c.peticion(tabla);
	}

}
