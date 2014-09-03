package com.concytec.bibliotecaapp.repository;

import java.util.List;

import com.concytec.bibliotecaapp.domain.Autor;
import com.concytec.bibliotecaapp.domain.Categoria;
import com.concytec.bibliotecaapp.domain.Recurso;


public interface RecursoDao {
	public void add(Recurso recurso);
	public void edit(Recurso recurso);
	public void delete(Recurso recurso);
	public Recurso getRecurso(int ideRec);
	public List<Recurso> getAllRecursos();
	//public int getLastInsertedId();
	public Categoria getRecursoCategoria(Recurso recurso);
	public List<Autor> getAllAutores(Recurso recurso);


}
