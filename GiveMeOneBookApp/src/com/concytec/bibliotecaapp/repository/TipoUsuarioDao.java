package com.concytec.bibliotecaapp.repository;

import java.util.List;
import com.concytec.bibliotecaapp.domain.TipoUsuario;

public interface TipoUsuarioDao {
	public void add(TipoUsuario tipoUsuario);
	public void edit(TipoUsuario tipoUsuario);
	public void delete(TipoUsuario tipoUsuario);
	public TipoUsuario getTipoUsuario(int ideTipUsu);
	public List<TipoUsuario> getAllTipoUsuario();

}
