package com.concytec.bibliotecaapp.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.concytec.bibliotecaapp.domain.Autor;
import com.concytec.bibliotecaapp.domain.TipoUsuario;

public class InMemoryAutorDao implements AutorDao {
	private SessionFactory sesion;
	private Session s ;
	private Transaction trans;
	
	public InMemoryAutorDao(){
		sesion = HibernateUtil.getSessionFactory();
	}
	
	public void add(Autor autor) {
		s = sesion.getCurrentSession();
		trans=s.beginTransaction();
		s.save(autor);
		trans.commit();		
	}

	
	public void edit(Autor autor) {
		s = sesion.getCurrentSession();
		trans=s.beginTransaction();
		s.update(autor);	
		trans.commit();	
	}

	
	public void delete(Autor autor) {
		s = sesion.getCurrentSession();
		trans=s.beginTransaction();
		s.delete(autor);	
		trans.commit();
	}

	
	public Autor getAutor(int codAut) {
		s = sesion.getCurrentSession();
		trans=s.beginTransaction();
		Autor autor = (Autor)s.get(Autor.class,codAut);
		trans.commit();		
		return autor;
	}

	
	public List<Autor> getAllAutores() {
		s = sesion.getCurrentSession();
		trans=s.beginTransaction();

		@SuppressWarnings("unchecked")
		List<Autor> listAutores = (List<Autor>)s.createQuery("from Autor").list();
		trans.commit();

		return listAutores;
	}

}
