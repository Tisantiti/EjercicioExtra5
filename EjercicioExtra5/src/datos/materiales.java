package datos;

public class materiales {
	private String informacion;
	private String codigo;
	private String titulo;
	private String actor;
	
	public materiales(String informacion, String codigo, String titulo, String actor) {
		super();
		this.informacion = informacion;
		this.codigo = codigo;
		this.titulo = titulo;
		this.actor = actor;
	}
	
	public String getInformacion() {
		return informacion;
	}
	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	
	
}
