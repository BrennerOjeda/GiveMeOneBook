package com.concytec.bibliotecaapp.repository;

import java.util.List;
import com.concytec.bibliotecaapp.domain.Categoria;

public interface CategoriaDao {
	public void add(Categoria categoria);
	public void edit(Categoria categoria);
	public void delete(Categoria categoria);
	public Categoria getCategoria(int codcat);
	public List<Categoria> getAllCategorias();

}
