package datos;

public class Libros extends materiales {
	private int numPaginas;
	
	public Libros(String informacion, String codigo, String titulo, String actor, int numPaginas) {
		super(informacion, codigo, titulo, actor);
		this.numPaginas = numPaginas;
	}

}
