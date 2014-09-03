package com.concytec.bibliotecaapp.repository;

import java.util.Set;

import com.concytec.bibliotecaapp.domain.Autor;
import com.concytec.bibliotecaapp.domain.Recurso;

public interface AutorRecursoDao {
	public void add(Recurso recurso, Set<Autor> autores);
	public void delete(Recurso ideRec);

}
