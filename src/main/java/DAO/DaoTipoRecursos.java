package DAO;

import java.util.ArrayList;

import ENTIDADES.RecursoTecnologico;
import ENTIDADES.TipoRecursoTecnologico;

public class DaoTipoRecursos {

	public static ArrayList<TipoRecursoTecnologico> getRecursos() {
		ArrayList<TipoRecursoTecnologico> tipoRecursoTecnologico = new ArrayList<TipoRecursoTecnologico>();
		TipoRecursoTecnologico asd = new TipoRecursoTecnologico("Todes","todes");
		tipoRecursoTecnologico.add(asd);
		TipoRecursoTecnologico asd2 = new TipoRecursoTecnologico("chau","asd");
		tipoRecursoTecnologico.add(asd2);
		TipoRecursoTecnologico asd3 = new TipoRecursoTecnologico("asdasd","asd");
		tipoRecursoTecnologico.add(asd3);
		
		return tipoRecursoTecnologico;
	}



	public static ArrayList<RecursoTecnologico> obtenerRecursosTecnológicosActivos() {
		// TODO Auto-generated method stub
		return null;
	}

}
