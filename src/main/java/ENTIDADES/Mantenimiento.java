package ENTIDADES;

import java.sql.Date;
import java.util.ArrayList;

public class Mantenimiento {
	
	private Date fechaFin;
	private Date fechaInicio;
	private Date fechaInicioPrevista;
	private String motivoMantenimiento;
	private ArrayList<ExtensionMantenimiento> extensionMantenimiento;
	
	//GETTERS AND SETTERS

	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaInicioPrevista() {
		return fechaInicioPrevista;
	}
	public void setFechaInicioPrevista(Date fechaInicioPrevista) {
		this.fechaInicioPrevista = fechaInicioPrevista;
	}
	public String getMotivoMantenimiento() {
		return motivoMantenimiento;
	}
	public void setMotivoMantenimiento(String motivoMantenimiento) {
		this.motivoMantenimiento = motivoMantenimiento;
	}
	public ArrayList<ExtensionMantenimiento> getExtensionMantenimiento() {
		return extensionMantenimiento;
	}
	public void setExtensionMantenimiento(ArrayList<ExtensionMantenimiento> extensionMantenimiento) {
		this.extensionMantenimiento = extensionMantenimiento;
	}
	
	
	

}
