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
	
	
	
	
}
