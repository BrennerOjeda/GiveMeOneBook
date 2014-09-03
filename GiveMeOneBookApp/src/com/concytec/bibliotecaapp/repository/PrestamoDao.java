package com.concytec.bibliotecaapp.repository;

import java.util.List;
import com.concytec.bibliotecaapp.domain.Prestamo;

public interface PrestamoDao {
	public void add(Prestamo prestamo);
	public void edit(Prestamo prestamo);
	public void delete(int idePres);
	public Prestamo getPrestamo(int idePres);
	public List<Prestamo> getAllPrestamos();
	

}
