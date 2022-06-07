package GESTOR;

import DAO.DaoUsuario;
import ENTIDADES.Usuario;

public class GestorUsuario {

	public static boolean validarUsuario(String usuario, String contraseņa) {
		Usuario user = DaoUsuario.usuarioPorUser(usuario);
		if (user.isHabilitado()) {
			if (user.getClave().equals(contraseņa))
				return true;
		}
		return false;
	}
}
