package ENTIDADES;

import java.util.ArrayList;

public class Facultad {
	
	private String nombre;
	private String domicilio;
	private PersonalCientifico responsableCyT;
	private ArrayList<CentroDeInvestigacion> centrosDeInvestigacion;
	
	//GETTERS AND SETTERS

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public PersonalCientifico getResponsableCyT() {
		return responsableCyT;
	}
	public void setResponsableCyT(PersonalCientifico responsableCyT) {
		this.responsableCyT = responsableCyT;
	}
	public ArrayList<CentroDeInvestigacion> getCentrosDeInvestigacion() {
		return centrosDeInvestigacion;
	}
	public void setCentrosDeInvestigacion(ArrayList<CentroDeInvestigacion> centrosDeInvestigacion) {
		this.centrosDeInvestigacion = centrosDeInvestigacion;
	} 
	
	

}
