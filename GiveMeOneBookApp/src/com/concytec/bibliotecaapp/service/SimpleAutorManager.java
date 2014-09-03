package com.concytec.bibliotecaapp.service;

import java.util.List;

import com.concytec.bibliotecaapp.domain.Autor;
import com.concytec.bibliotecaapp.repository.AutorDao;
import com.concytec.bibliotecaapp.repository.InMemoryAutorDao;

public class SimpleAutorManager {
private AutorDao autorDao;
	
	public void insertAutor(String nomAut,String apeAut)
	{
		Autor nuevoAutor = new Autor();
		nuevoAutor.setNomAut(nomAut);
		nuevoAutor.setApeAut(apeAut);
		System.out.println("insertar autor " + nuevoAutor.getNomAut());
		autorDao = new InMemoryAutorDao();
		autorDao.add(nuevoAutor);		
	}
	
	public void editAutor(int codAut, String nomAut,String apeAut)
	{
		//TipoUsuario updateTipo = new TipoUsuario();
		System.out.println("actualizar  tipo usuario " + codAut);
		autorDao = new InMemoryAutorDao();
		Autor updateAutor = autorDao.getAutor(codAut);
		updateAutor.setNomAut(nomAut);
		updateAutor.setApeAut(apeAut);
		autorDao.edit(updateAutor);		
	}
	
	public void deleteAutor(int codAut)
	{
		System.out.println("eliminar autor " + codAut);
		autorDao = new InMemoryAutorDao();
		Autor delAutor = autorDao.getAutor(codAut);
		autorDao.delete(delAutor);		
	}
	
	public Autor getAutor(int codAut){
		autorDao = new InMemoryAutorDao();
		return autorDao.getAutor(codAut);
		
	}
	
	public List<Autor>  getListaAutores(){
		autorDao = new InMemoryAutorDao();
		return autorDao.getAllAutores();		
	}
}