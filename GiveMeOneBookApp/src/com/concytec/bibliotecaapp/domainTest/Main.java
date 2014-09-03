package com.concytec.bibliotecaapp.domainTest;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.concytec.bibliotecaapp.domain.Autor;
import com.concytec.bibliotecaapp.domain.Recurso;
import com.concytec.bibliotecaapp.domain.TipoUsuario;
import com.concytec.bibliotecaapp.service.SimpleAutorManager;
import com.concytec.bibliotecaapp.service.SimpleCategoriaManager;
import com.concytec.bibliotecaapp.service.SimpleRecursoManager;
import com.concytec.bibliotecaapp.service.SimpleTipoUsuarioManger;
import com.concytec.bibliotecaapp.service.SimpleUsuarioManager;


public class Main {
	public static void main(String[] args) {

//------ agregando nuevo tipo usuario
//		NewTipoUsuario manager = new NewTipoUsuario();
//		manager.insertTipoUsuario("Invitado");
		
//------ editando el tipo de usuario		
//		NewTipoUsuario manager = new NewTipoUsuario();
//		manager.editTipoUsuario(6, "Invitado especial");

//------ eliminando el tipo de usuario		
//		NewTipoUsuario manager = new NewTipoUsuario();
//		manager.deleteTipoUsuario(6);
		
//------ lista de tipos usuarios
//		NewTipoUsuario manager = new NewTipoUsuario();		
//		List<TipoUsuario> listaUsuarios  = manager.getListTipoUsuarios();
//		for(TipoUsuario tipo : listaUsuarios)
//		{
//			System.out.println(tipo.getIdeTipUsu() + " " +tipo.getNomTipUsu());			
//		}
		
//------ insertando Nuevo Usuario
//		NewTipoUsuario tipousu = new NewTipoUsuario();
//		TipoUsuario tipo = tipousu.getTipoUsuario(3);
//		NewUsuario nusuario = new NewUsuario();
//		nusuario.insertUsuario("74859612", tipo, "jose", "mendez",234343, "Av Canada s/n", "jose@gmail.com", "qaz123", "Disponible");
		
//------ editando Nuevo Usuario
//		NewTipoUsuario tipousu = new NewTipoUsuario();
//		TipoUsuario tipo = tipousu.getTipoUsuario(2);
//		NewUsuario nusuario = new NewUsuario();
//		nusuario.editUsuario("74859612", tipo, "jose", "mendez",234343, "Av Canada s/n", "jose@gmail.com", "qaz123", "Disponible");

//------ eliminando el  usuario		
//		NewUsuario nusuario = new NewUsuario();
//		nusuario.deleteUsuario("74859612");
		
//------ agregando nuevo autor
//		NewAutor nautor = new NewAutor();
//		nautor.insertAutor("Pedro", "Gonzales Sosa");
		
//------ editando el autor		
//		NewAutor nautor = new NewAutor();
//		nautor.editAutor(6, "Humberto", "Gonsales");

//------ eliminando autor		
//		NewAutor nautor = new NewAutor();
//		nautor.deleteAutor(6);
		
//------ lista de tipos usuarios
//		NewAutor nautor = new NewAutor();		
//		List<Autor> listaAutores  = nautor.getListaAutores();
//		for(Autor aut : listaAutores)
//		{
//			System.out.println(aut.getNomAut()+ " " +aut.getApeAut());			
//		}		
		
		/*falta arrgelar*/
//		insertando nuevo recurso
//		NewCategoria categoria = new NewCategoria();
//		Categoria cat = categoria.getCategoria(3);
//		NewAutor autor = new NewAutor();
//		Set<Autor> autores = new HashSet<Autor>();
//		autores.add(autor.getAutor(1));
//		autores.add(autor.getAutor(2));
//		NewRecurso nRecurso = new NewRecurso();
//		nRecurso.insertRecurso(cat, "libro 4", "Los alamos 123", 2014, "Disponible",autores);
//		
	    //----- Lista de usuarios -----	
//		NewUsuario usuario = new NewUsuario();		
//		List<Usuario> listaAutores  = usuario.getListUsuarios();
//		for(Usuario aut : listaAutores)
//		{
//			System.out.println(aut.getNomUsu()+ " " +aut.getDocIdeUsu());			
//		}		
		
//		//------Login -----
//		SimpleUsuarioManager usuario = new SimpleUsuarioManager();
//		Usuario u = usuario.login("46572080", "12345");
//		if(u != null)
//			System.out.println(u.getNomUsu() +" "+u.getApeUsu());
//		else System.out.println("Error de logeo");
	

		//------ agregar nuevo recurso		
//		SimpleCategoriaManager categoria = new SimpleCategoriaManager();
//		Categoria cat = categoria.getCategoria(3);
//				
//		Set<Autor> autores = new HashSet<Autor>();
//		SimpleAutorManager autor = new SimpleAutorManager();
//		autores.add(autor.getAutor(1));
//		autores.add(autor.getAutor(2));
//			
//		SimpleRecursoManager nRecurso = new SimpleRecursoManager();
//		nRecurso.insertRecurso(cat, "libro 555555", "Los alamos 5555", 2014, "Disponible",autores);

		//--- todos los recursos
		SimpleRecursoManager recurso = new SimpleRecursoManager();
		List<Recurso> listaRecursos  = recurso.getListRecurso();
		for(Recurso aut : listaRecursos)
		{
			System.out.println(aut.getTitRec()+ " " +aut.getIdeRec());			
		}
	}


}
