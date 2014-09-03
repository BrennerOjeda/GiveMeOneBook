package com.concytec.bibliotecaapp.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.concytec.bibliotecaapp.domain.TipoUsuario;


public class InMemoryTipoUsuarioDao implements TipoUsuarioDao{

	private SessionFactory sesion;
	private Session s ;
	private Transaction trans;
	
	public InMemoryTipoUsuarioDao(){
		sesion = HibernateUtil.getSessionFactory();
	}
	
	
	public void add(TipoUsuario tipoUsuario) {
		s = sesion.getCurrentSession();
		trans=s.beginTransaction();
		s.save(tipoUsuario);
		trans.commit();
	}

	
	public void edit(TipoUsuario tipoUsuario) {
		s = sesion.getCurrentSession();
		trans=s.beginTransaction();
		s.update(tipoUsuario);	
		trans.commit();
	}

	
	public void delete(TipoUsuario tipoUsuario ) {
		s = sesion.getCurrentSession();
		trans=s.beginTransaction();
		s.delete(tipoUsuario);	
		trans.commit();
	}

	
	public TipoUsuario getTipoUsuario(int ideTipUsu) {
		s = sesion.getCurrentSession();
		trans=s.beginTransaction();
		TipoUsuario tipo = (TipoUsuario)s.get(TipoUsuario.class,ideTipUsu);
		trans.commit();		
		return tipo;
	}

	
	public List<TipoUsuario> getAllTipoUsuario() {
		
		s = sesion.getCurrentSession();
		trans=s.beginTransaction();

		@SuppressWarnings("unchecked")
		List<TipoUsuario> listTipoUsuarios = (List<TipoUsuario>)s.createQuery("from TipoUsuario").list();
		trans.commit();

		return listTipoUsuarios;
	}

}
