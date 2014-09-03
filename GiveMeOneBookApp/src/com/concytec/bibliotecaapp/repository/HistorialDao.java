package com.concytec.bibliotecaapp.repository;

import java.util.List;
import com.concytec.bibliotecaapp.domain.Historial;

public interface HistorialDao {
	public void add(Historial historial);
	public void edit(Historial historial);
	public Historial getHistorial(int ideHis);
	public List<Historial> getAllHistorial();

}
