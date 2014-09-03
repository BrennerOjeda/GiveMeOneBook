package com.concytec.bibliotecaapp.repository;

import java.util.List;
import com.concytec.bibliotecaapp.domain.Autor;


public interface AutorDao {
	public void add(Autor autor);
	public void edit(Autor autor);
	public void delete(Autor autor);
	public Autor getAutor(int codAut);
	public List<Autor> getAllAutores();
	

}
