package DAO;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ENTIDADES.Usuario;

public class DaoUsuario {
	static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

	public ArrayList<Usuario> getUsuarios() {
		Usuario usuario = new Usuario("admin", "asd123", true);
		usuarios.add(usuario);
		return usuarios;
	}

	public static Usuario usuarioPorUser(String user) {
		Usuario usuario = new Usuario("admin", "asd123", true);
		usuarios.add(usuario);
		Usuario usuario2 = new Usuario("asd", "asd123", true);
		usuarios.add(usuario2);

		for (Usuario usr : usuarios) {

			if (usr.getUsuario().equals(user)) {
				return usr;
			}
		}
		return null;
	}
}