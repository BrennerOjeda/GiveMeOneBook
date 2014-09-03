package com.concytec.bibliotecaapp.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import com.concytec.bibliotecaapp.domain.Historial;

public class InMemoryHistorialDao implements HistorialDao {
	private SessionFactory sesion;

	
	public void add(Historial historial) {
		this.sesion.getCurrentSession().save(historial);		
	}

	
	public void edit(Historial historial) {
		this.sesion.getCurrentSession().update(historial);		
	}

	
	public Historial getHistorial(int ideHis) {
		return (Historial)this.sesion.getCurrentSession().get(Historial.class,ideHis);
	}

	
	public List<Historial> getAllHistorial() {
		@SuppressWarnings("unchecked")
		List<Historial> listHistorial = (List<Historial>)this.sesion.getCurrentSession().createQuery("from historial").list();
		return listHistorial;
	}

}
