package GESTOR;

import java.util.ArrayList;

import DAO.DaoTipoRecursos;
import ENTIDADES.RecursoTecnologico;
import ENTIDADES.TipoRecursoTecnologico;

public class GestorTurnos {

	public static void nuevoRegistroDeTurnoRecursoTecnologico() {
		buscarTipoDeRecurso();

	}

	public static ArrayList<String> buscarTipoDeRecurso() {
		ArrayList<TipoRecursoTecnologico> tipoRecursos = new ArrayList<TipoRecursoTecnologico>();
		tipoRecursos = DaoTipoRecursos.getRecursos();
		ArrayList<String> resultado = new ArrayList<String>();
		for (TipoRecursoTecnologico tipoRecursoTecnologico : tipoRecursos) {
			resultado.add(tipoRecursoTecnologico.getNombre());
		}
		return resultado;

	}

	public static ArrayList<RecursoTecnologico> tomarSeleccion(String tipoRecursoSeleccionado) {
		ArrayList<RecursoTecnologico> recursosActivos = obtenerRecursosTecnológicosActivos();

		return recursosActivos;

	}

	private static ArrayList<RecursoTecnologico> obtenerRecursosTecnológicosActivos() {
		for (RecursoTecnologico recursoTecnologico : recursosActivos) {
			if (RecursoTecnologico.esDeTipoSeleccionado(recursoTecnologico, tipoRecursoSeleccionado)) {

			}
		}
		return DaoTipoRecursos.obtenerRecursosTecnológicosActivos();
	}

}
