package datos;

public class Discos extends materiales {
	private String nombreDiscografia;
	
	public Discos(String informacion, String codigo, String titulo, String actor, String nombreDiscografia) {
		super(informacion, codigo, titulo, actor);
		this.nombreDiscografia = nombreDiscografia;
	}
	
	public String getNombreDiscografia() {
		return nombreDiscografia;
	}

	public void setNombreDiscografia(String nombreDiscografia) {
		this.nombreDiscografia = nombreDiscografia;
	}

	
}
