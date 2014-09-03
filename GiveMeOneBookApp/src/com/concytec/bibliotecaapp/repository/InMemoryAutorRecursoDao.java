package com.concytec.bibliotecaapp.repository;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.concytec.bibliotecaapp.domain.Autor;
import com.concytec.bibliotecaapp.domain.Recurso;

public class InMemoryAutorRecursoDao implements AutorRecursoDao {
	private SessionFactory sesion;
	private Session s ;
	private Transaction trans;

	
	public InMemoryAutorRecursoDao(){
		sesion = HibernateUtil.getSessionFactory();
	}

	public void add(Recurso recurso, Set<Autor> autores) {	
		s = sesion.getCurrentSession();
 		trans=s.beginTransaction();    
		Autor aut = new Autor();
		Iterator<Autor> iterator = autores.iterator();	
		
     	while(iterator.hasNext()){   
     		//autorDao = new InMemoryAutorDao(sesion);
     		aut = (Autor) s.get(Autor.class, (iterator.next()).getCodAut());
     		//aut =autorDao.getAutor(iterator.next().getCodAut());    	 		
     		aut.getRecursos().add(recurso);   
     	}
     	s.save(recurso);
     	trans.commit();			
	}

	public void delete(Recurso ideRec) {
		s = sesion.getCurrentSession();
 		trans=s.beginTransaction();
		
	}
	
	

}
