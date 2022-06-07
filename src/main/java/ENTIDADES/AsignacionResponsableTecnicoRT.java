package ENTIDADES;

import java.sql.Date;
import java.util.ArrayList;

public class AsignacionResponsableTecnicoRT {

	private Date fechaDesde;
	private Date fechaHasta;
	private PersonalCientifico personalCientifico;
	private ArrayList<RecursoTecnologico> recursosTecnológicos;

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
	public ArrayList<RecursoTecnologico> getRecursosTecnológicos() {
		return recursosTecnológicos;
	}
	public void setRecursosTecnológicos(ArrayList<RecursoTecnologico> recursosTecnológicos) {
		this.recursosTecnológicos = recursosTecnológicos;
	}
	
	
	
}
