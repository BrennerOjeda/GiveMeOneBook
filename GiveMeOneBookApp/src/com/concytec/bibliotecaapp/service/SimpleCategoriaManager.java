package com.concytec.bibliotecaapp.service;

import java.util.List;

import com.concytec.bibliotecaapp.domain.Categoria;
import com.concytec.bibliotecaapp.repository.CategoriaDao;
import com.concytec.bibliotecaapp.repository.InMemoryCategoriaDao;

public class SimpleCategoriaManager {
private CategoriaDao categoriaDao;
	
	public void insertCategoria(String nombre,String desCat)
	{
		Categoria nuevaCategoria = new Categoria();
		nuevaCategoria.setNomCat(nombre);
		nuevaCategoria.setDesCat(desCat);
		System.out.println("insertar Categoria " + nuevaCategoria.getNomCat());
		categoriaDao = new InMemoryCategoriaDao();
		categoriaDao.add(nuevaCategoria);		
	}
	
	public void editCategoria(int codCat, String nomCat, String desCat)
	{
		//TipoUsuario updateTipo = new TipoUsuario();
		System.out.println("actualizar  categoria " + codCat);
		categoriaDao = new InMemoryCategoriaDao();
		Categoria updateCategoria = categoriaDao.getCategoria(codCat);
		updateCategoria.setNomCat(nomCat);
		updateCategoria.setDesCat(desCat);
		categoriaDao.edit(updateCategoria);
	}
	
	public void deleteCategoria(int codCat)
	{

		System.out.println("eliminar Categoria " + codCat);
		categoriaDao = new InMemoryCategoriaDao();
		Categoria delCategoria = categoriaDao.getCategoria(codCat);
		categoriaDao.delete(delCategoria);		
	}
	
	public Categoria getCategoria(int codCat){
		categoriaDao = new InMemoryCategoriaDao();
		return categoriaDao.getCategoria(codCat);
		
	}
	public List<Categoria>  getListCategoria(){
		categoriaDao = new InMemoryCategoriaDao();
		return categoriaDao.getAllCategorias();
		
	}

}
