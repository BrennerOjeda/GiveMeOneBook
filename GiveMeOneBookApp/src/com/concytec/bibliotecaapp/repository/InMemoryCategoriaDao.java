package com.concytec.bibliotecaapp.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.concytec.bibliotecaapp.domain.Categoria;
import com.concytec.bibliotecaapp.domain.TipoUsuario;


public class InMemoryCategoriaDao implements CategoriaDao {

	private SessionFactory sesion;
	private Session s ;
	private Transaction trans;
	
	public InMemoryCategoriaDao(){
		sesion = HibernateUtil.getSessionFactory();
	}
	
	public void add(Categoria categoria) {
		s = sesion.getCurrentSession();
		trans=s.beginTransaction();
		s.save(categoria);
		trans.commit();		
	}

	
	public void edit(Categoria categoria) {
		s = sesion.getCurrentSession();
		trans=s.beginTransaction();
		s.update(categoria);	
		trans.commit();		
	}

	
	public void delete(Categoria categoria) {
		s = sesion.getCurrentSession();
		trans=s.beginTransaction();
		s.delete(categoria);	
		trans.commit();		
	}

	
	public Categoria getCategoria(int codCat) {
		s = sesion.getCurrentSession();
		trans=s.beginTransaction();
		Categoria cat = (Categoria)s.get(Categoria.class,codCat);
		trans.commit();		
		return cat;
	}

	
	public List<Categoria> getAllCategorias() {
		s = sesion.getCurrentSession();
		trans=s.beginTransaction();

		@SuppressWarnings("unchecked")
		List<Categoria> listCategorias = (List<Categoria>)s.createQuery("from Categoria").list();
		trans.commit();

		return listCategorias;
	}

}
