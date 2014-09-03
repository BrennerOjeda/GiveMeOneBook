package com.concytec.bibliotecaapp.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.concytec.bibliotecaapp.domain.Autor;
import com.concytec.bibliotecaapp.domain.Categoria;
import com.concytec.bibliotecaapp.domain.Recurso;

public class InMemoryRecursoDao implements RecursoDao{

	private SessionFactory sesion;
	private Session s ;
	private Transaction trans;
	
	public InMemoryRecursoDao() {
		sesion = HibernateUtil.getSessionFactory();
	}
	public InMemoryRecursoDao(SessionFactory sesion) {
		this.sesion = sesion;
	}
		

	public void add(Recurso recurso) {
		s = sesion.getCurrentSession();
		trans=s.beginTransaction();
		s.save(recurso);
		trans.commit();
		
	}

	public void edit(Recurso recurso) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Recurso recurso) {
		// TODO Auto-generated method stub
		
	}

	public Recurso getRecurso(int ideRec) {
		s = sesion.getCurrentSession();
		trans=s.beginTransaction();
		Recurso recurso = (Recurso)s.get(Recurso.class,ideRec);
		trans.commit();		
		return recurso;
	}

	public List<Recurso> getAllRecursos() {
		// TODO Auto-generated method stub
		s = sesion.getCurrentSession();
		trans=s.beginTransaction();

		@SuppressWarnings("unchecked")
		List<Recurso> listRecursos = (List<Recurso>)s.createQuery("from Recurso").list();
		trans.commit();

		return listRecursos;
	}

	public Categoria getRecursoCategoria(Recurso recurso) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Autor> getAllAutores(Recurso recurso) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
