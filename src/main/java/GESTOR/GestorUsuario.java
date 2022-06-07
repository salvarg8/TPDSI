package GESTOR;

import DAO.DaoUsuario;
import ENTIDADES.Usuario;

public class GestorUsuario {

	public static boolean validarUsuario(String usuario, String contrase�a) {
		Usuario user = DaoUsuario.usuarioPorUser(usuario);
		if (user.isHabilitado()) {
			if (user.getClave().equals(contrase�a))
				return true;
		}
		return false;
	}
}
