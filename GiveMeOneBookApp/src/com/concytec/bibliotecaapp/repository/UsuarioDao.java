package com.concytec.bibliotecaapp.repository;

import java.util.List;
import com.concytec.bibliotecaapp.domain.Usuario;

public interface UsuarioDao {
	public void add(Usuario usuario);
	public void edit(Usuario usuario);
	public void delete(Usuario usuario);
	public Usuario getUsuario(String docIdeUsu);
	public List<Usuario> getAllUsuarios();
	public Usuario loginUsuario (String docIdeUsu, String password);
	

}
