package com.concytec.bibliotecaapp.service;

import java.util.List;

import com.concytec.bibliotecaapp.repository.InMemoryUsuarioDao;
import com.concytec.bibliotecaapp.repository.UsuarioDao;
import com.concytec.bibliotecaapp.domain.TipoUsuario;
import com.concytec.bibliotecaapp.domain.Usuario;

public class SimpleUsuarioManager {
private UsuarioDao usuarioDao;
	
	public void insertUsuario(String docIdeUsu, TipoUsuario tipoUsuario, String nomUsu,
			String apeUsu, Integer telUsu, String dirUsu, String emaUsu,
			String passUsu, String estUsu)
	{
		
		Usuario nuevoUsuario = new Usuario();
		nuevoUsuario.setDocIdeUsu(docIdeUsu);
		nuevoUsuario.setTipoUsuario(tipoUsuario);
		nuevoUsuario.setNomUsu(nomUsu);
		nuevoUsuario.setApeUsu(apeUsu);
		nuevoUsuario.setTelUsu(telUsu);
		nuevoUsuario.setDirUsu(dirUsu);
		nuevoUsuario.setEmaUsu(emaUsu);
		nuevoUsuario.setPassUsu(passUsu);
		nuevoUsuario.setEstUsu(estUsu);		
		System.out.println("insertar  nuevo usuario " + nuevoUsuario.getDocIdeUsu());
		usuarioDao = new InMemoryUsuarioDao();
		usuarioDao.add(nuevoUsuario);		
	}
	
	public void editUsuario(String docIdeUsu, TipoUsuario tipoUsuario, String nomUsu,
			String apeUsu, Integer telUsu, String dirUsu, String emaUsu,
			String passUsu, String estUsu)
	{
		
		System.out.println("actualizando usuario " + docIdeUsu);
		usuarioDao = new InMemoryUsuarioDao();
		Usuario updateUsuario = usuarioDao.getUsuario(docIdeUsu);
		updateUsuario.setTipoUsuario(tipoUsuario);
		updateUsuario.setNomUsu(nomUsu);
		updateUsuario.setApeUsu(apeUsu);
		updateUsuario.setTelUsu(telUsu);
		updateUsuario.setDirUsu(dirUsu);
		updateUsuario.setEmaUsu(emaUsu);
		updateUsuario.setPassUsu(passUsu);
		updateUsuario.setEstUsu(estUsu);		
		usuarioDao.edit(updateUsuario);		
	}

	
	public void editUsuario(String docIdeUsu, String nomUsu,
			String apeUsu, String emaUsu)
	{
		
		System.out.println("actualizando usuario " + docIdeUsu);
		usuarioDao = new InMemoryUsuarioDao();
		Usuario updateUsuario = usuarioDao.getUsuario(docIdeUsu);
		updateUsuario.setNomUsu(nomUsu);
		updateUsuario.setApeUsu(apeUsu);
		updateUsuario.setEmaUsu(emaUsu);
		usuarioDao.edit(updateUsuario);		
	}
	
	
	public void deleteUsuario(String docIdeUsu)
	{
		System.out.println("eliminando usuario " + docIdeUsu);
		usuarioDao = new InMemoryUsuarioDao();
		Usuario delUsuario = usuarioDao.getUsuario(docIdeUsu);
		usuarioDao.delete(delUsuario);		
	}
	
	public Usuario getCodIdeUsuario(String docIde){
		usuarioDao = new InMemoryUsuarioDao();
		return usuarioDao.getUsuario(docIde);		
	}
	
	public List<Usuario>  getListUsuarios(){
		usuarioDao = new InMemoryUsuarioDao();
		return usuarioDao.getAllUsuarios();
		
	}
	
	public Usuario login(String docIdeUsu, String password){
		usuarioDao = new InMemoryUsuarioDao();
		return usuarioDao.loginUsuario(docIdeUsu, password);
	}
	
	public boolean existUser(String docIdeUsu, String password){
		usuarioDao = new InMemoryUsuarioDao();
		return usuarioDao.loginUsuario(docIdeUsu, password) != null;
	}
}
