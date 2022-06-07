package ENTIDADES;

import java.sql.Date;
import java.util.ArrayList;

public class CentroDeInvestigacion {
	
	private String nombre;
	private String sigla;
	private String direccion;
	private String edificio;
	private String piso;
	private String coordenadas;
	private String telefonosContacto;
	private String correoElectronico;
	private int numeroResolucionCreacion;
	private Date fechaResolucionCreacion;
	private String reglamento;
	private String caracteristicasGenerales; 
	private Date fechaAlta;
	private int tiempoAntelacionReserva;
	private Date fechaBaja;
	private String motivoBaja;
	private ArrayList<AsignacionDirectorCI> directoriDelCI;
	private ArrayList<AsignacionDelCientificoDelCI> cientificos;
	private ArrayList<RecursoTecnologico> recursosTecnologicos;
	
	//GETTERS AND SETTERS

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEdificio() {
		return edificio;
	}
	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}
	public String getPiso() {
		return piso;
	}
	public void setPiso(String piso) {
		this.piso = piso;
	}
	public String getCoordenadas() {
		return coordenadas;
	}
	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}
	public String getTelefonosContacto() {
		return telefonosContacto;
	}
	public void setTelefonosContacto(String telefonosContacto) {
		this.telefonosContacto = telefonosContacto;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public int getNumeroResolucionCreacion() {
		return numeroResolucionCreacion;
	}
	public void setNumeroResolucionCreacion(int numeroResolucionCreacion) {
		this.numeroResolucionCreacion = numeroResolucionCreacion;
	}
	public Date getFechaResolucionCreacion() {
		return fechaResolucionCreacion;
	}
	public void setFechaResolucionCreacion(Date fechaResolucionCreacion) {
		this.fechaResolucionCreacion = fechaResolucionCreacion;
	}
	public String getReglamento() {
		return reglamento;
	}
	public void setReglamento(String reglamento) {
		this.reglamento = reglamento;
	}
	public String getCaracteristicasGenerales() {
		return caracteristicasGenerales;
	}
	public void setCaracteristicasGenerales(String caracteristicasGenerales) {
		this.caracteristicasGenerales = caracteristicasGenerales;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public int getTiempoAntelacionReserva() {
		return tiempoAntelacionReserva;
	}
	public void setTiempoAntelacionReserva(int tiempoAntelacionReserva) {
		this.tiempoAntelacionReserva = tiempoAntelacionReserva;
	}
	public Date getFechaBaja() {
		return fechaBaja;
	}
	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	public String getMotivoBaja() {
		return motivoBaja;
	}
	public void setMotivoBaja(String motivoBaja) {
		this.motivoBaja = motivoBaja;
	}
	public ArrayList<AsignacionDirectorCI> getDirectoriDelCI() {
		return directoriDelCI;
	}
	public void setDirectoriDelCI(ArrayList<AsignacionDirectorCI> directoriDelCI) {
		this.directoriDelCI = directoriDelCI;
	}
	public ArrayList<AsignacionDelCientificoDelCI> getCientificos() {
		return cientificos;
	}
	public void setCientificos(ArrayList<AsignacionDelCientificoDelCI> cientificos) {
		this.cientificos = cientificos;
	}
	public ArrayList<RecursoTecnologico> getRecursosTecnologicos() {
		return recursosTecnologicos;
	}
	public void setRecursosTecnologicos(ArrayList<RecursoTecnologico> recursosTecnologicos) {
		this.recursosTecnologicos = recursosTecnologicos;
	}
	
	

	
	
	
}
