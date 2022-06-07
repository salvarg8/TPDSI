package ENTIDADES;

import java.sql.Date;

public class AsignacionDirectorCI {

	private Date fechaDesde;
	private Date fechaHasta;
	private PersonalCientifico personalCientifico;
	
	//GETTERS AND SETTERS

	public Date getFechaDesde() {
		return fechaDesde;
	}
	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}
	public Date getFechaHasta() {
		return fechaHasta;
	}
	public void setFechaHasta(Date fechaHasta) {
		this.fechaHasta = fechaHasta;
	}
	public PersonalCientifico getPersonalCientifico() {
		return personalCientifico;
	}
	public void setPersonalCientifico(PersonalCientifico personalCientifico) {
		this.personalCientifico = personalCientifico;
	}
	
	
}
