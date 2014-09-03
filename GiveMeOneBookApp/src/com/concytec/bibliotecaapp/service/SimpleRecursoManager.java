package com.concytec.bibliotecaapp.service;

import java.util.List;
import java.util.Set;

import com.concytec.bibliotecaapp.domain.Autor;
import com.concytec.bibliotecaapp.domain.Categoria;
import com.concytec.bibliotecaapp.domain.Prestamo;
import com.concytec.bibliotecaapp.domain.Recurso;
import com.concytec.bibliotecaapp.repository.AutorRecursoDao;
import com.concytec.bibliotecaapp.repository.InMemoryAutorRecursoDao;
import com.concytec.bibliotecaapp.repository.InMemoryCategoriaDao;
import com.concytec.bibliotecaapp.repository.InMemoryRecursoDao;
import com.concytec.bibliotecaapp.repository.RecursoDao;

public class SimpleRecursoManager {
	private RecursoDao recursoDao;
	private AutorRecursoDao autorRecursoDao;

	public void insertRecurso( Categoria categoria, String titRec, String editRec,
			Integer anioEdicRec, String estRec, Set<Autor> autors){
			
		Recurso nuevoRecurso= new Recurso();
		nuevoRecurso.setCategoria(categoria);
		nuevoRecurso.setTitRec(titRec);
		nuevoRecurso.setEditRec(editRec);
		nuevoRecurso.setAnioEdicRec(anioEdicRec);
		nuevoRecurso.setEstRec(estRec);
		nuevoRecurso.getAutors().addAll(autors);
		//trans = s.beginTransaction();
		//Autor au = new Autor();
		autorRecursoDao = new InMemoryAutorRecursoDao();
		autorRecursoDao.add(nuevoRecurso, autors);
		System.out.println("insertar  nuevo recurso: " + nuevoRecurso.getIdeRec() + " " + nuevoRecurso.getTitRec()+ " " + nuevoRecurso.getAutors());	
		
	}
	
	public void deleteRecurso(int ideRec)
	{
		recursoDao = new InMemoryRecursoDao();
		Recurso delRecurso = recursoDao.getRecurso(ideRec);
		recursoDao.delete(delRecurso);
		System.out.println("eliminar Recurso " + ideRec);
			
	}
	
	public Recurso getRecurso(int ideRec){
		recursoDao = new InMemoryRecursoDao();
		return recursoDao.getRecurso(ideRec);
		
	}
	public List<Recurso>  getListRecurso(){
		recursoDao = new InMemoryRecursoDao();
		return recursoDao.getAllRecursos();
		
	}

}
