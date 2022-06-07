package ENTIDADES;

import java.sql.Date;

public class ExtensionMantenimiento {
	
	private Date fecha;
	private Date fechaFinPrevista;
	private String motivo;
	
	//GETTERS AND SETTERS

	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Date getFechaFinPrevista() {
		return fechaFinPrevista;
	}
	public void setFechaFinPrevista(Date fechaFinPrevista) {
		this.fechaFinPrevista = fechaFinPrevista;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
	
}
