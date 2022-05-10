package ENTIDADES;

public class Usuario {
	
	private String clave;
	private String usuario;
	private boolean habilitado;
	
	
	public Usuario(String clave, String usuario, boolean habilitado) {
		super();
		this.clave = clave;
		this.usuario = usuario;
		this.habilitado = habilitado;
	}


	// GETTERS AND SETTERS
	
	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}


	public String getUsuario() {
		return usuario;
	}


	public boolean isHabilitado() {
		return habilitado;
	}


	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	
	

	
	
}
