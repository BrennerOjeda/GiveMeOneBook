package com.concytec.bibliotecaapp.service;

import java.util.List;
import com.concytec.bibliotecaapp.repository.InMemoryTipoUsuarioDao;
import com.concytec.bibliotecaapp.repository.TipoUsuarioDao;
import com.concytec.bibliotecaapp.domain.TipoUsuario;

public class SimpleTipoUsuarioManger {
	private TipoUsuarioDao tipoUsuarioDao;
	
	public void insertTipoUsuario(String nombre)
	{
		TipoUsuario nuevoTipo = new TipoUsuario();
		nuevoTipo.setNomTipUsu(nombre);
		System.out.println("insertar  tipo usuario " + nuevoTipo.getNomTipUsu());
		tipoUsuarioDao = new InMemoryTipoUsuarioDao();
		tipoUsuarioDao.add(nuevoTipo);		
	}
	
	public void editTipoUsuario(int codtip, String nombre)
	{
		//TipoUsuario updateTipo = new TipoUsuario();
		System.out.println("actualizar  tipo usuario " + codtip);
		tipoUsuarioDao = new InMemoryTipoUsuarioDao();
		TipoUsuario updateTipo = tipoUsuarioDao.getTipoUsuario(codtip);
		updateTipo.setNomTipUsu(nombre);
		tipoUsuarioDao.edit(updateTipo);		
	}
	
	public void deleteTipoUsuario(int codtip)
	{
//		TipoUsuario delTipo = new TipoUsuario();
//		delTipo.setIdeTipUsu(codtip);
		System.out.println("eliminar tipo usuario " + codtip);
		tipoUsuarioDao = new InMemoryTipoUsuarioDao();
		TipoUsuario delTipo = tipoUsuarioDao.getTipoUsuario(codtip);
		tipoUsuarioDao.delete(delTipo);		
	}
	
	public TipoUsuario getTipoUsuario(int codtip){
		tipoUsuarioDao = new InMemoryTipoUsuarioDao();
		return tipoUsuarioDao.getTipoUsuario(codtip);
		
	}
	public List<TipoUsuario>  getListTipoUsuarios(){
		tipoUsuarioDao = new InMemoryTipoUsuarioDao();
		return tipoUsuarioDao.getAllTipoUsuario();
		
	}

	
}
