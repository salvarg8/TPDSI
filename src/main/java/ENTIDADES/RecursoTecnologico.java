package ENTIDADES;

import java.sql.Date;

public class RecursoTecnologico {
	
	private int numeroRT;
	private Date fechaAlta;
	// ver como guardar las imagenes
	private int periodicidadMantenimientoPrev;
	private int DuracionMantenimientoPrev; 
	private int FraccionHorariosTurnos;
	private TipoRecursoTecnologico tipoRecurso;
	//GETTERS AND SETTERS

	public TipoRecursoTecnologico getTipoRecurso() {
		return tipoRecurso;
	}
	public void setTipoRecurso(TipoRecursoTecnologico tipoRecurso) {
		this.tipoRecurso = tipoRecurso;
	}
	public int getNumeroRT() {
		return numeroRT;
	}
	public void setNumeroRT(int numeroRT) {
		this.numeroRT = numeroRT;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public int getPeriodicidadMantenimientoPrev() {
		return periodicidadMantenimientoPrev;
	}
	public void setPeriodicidadMantenimientoPrev(int periodicidadMantenimientoPrev) {
		this.periodicidadMantenimientoPrev = periodicidadMantenimientoPrev;
	}
	public int getDuracionMantenimientoPrev() {
		return DuracionMantenimientoPrev;
	}
	public void setDuracionMantenimientoPrev(int duracionMantenimientoPrev) {
		DuracionMantenimientoPrev = duracionMantenimientoPrev;
	}
	public int getFraccionHorariosTurnos() {
		return FraccionHorariosTurnos;
	}
	public void setFraccionHorariosTurnos(int fraccionHorariosTurnos) {
		FraccionHorariosTurnos = fraccionHorariosTurnos;
	}
	
	
	
	public static boolean (RecursoTecnologico recursoTecnologico, String tipoRecurso) {
		if (recursoTecnologico.getTipoRecurso().equals(tipoRecurso)) {
			return true;
		}
		return false;
	

}
