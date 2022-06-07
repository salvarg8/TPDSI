package GESTOR;

import DAO.DaoUsuario;
import ENTIDADES.Usuario;

public class GestorUsuario {

	public static boolean validarUsuario(String usuario, String contraseña) {
		Usuario user = DaoUsuario.usuarioPorUser(usuario);
		if (user.isHabilitado()) {
			if (user.getClave().equals(contraseña))
				return true;
		}
		return false;
	}
}
