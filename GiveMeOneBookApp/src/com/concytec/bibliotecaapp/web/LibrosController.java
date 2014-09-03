package com.concytec.bibliotecaapp.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.concytec.bibliotecaapp.domain.Recurso;
import com.concytec.bibliotecaapp.service.LibrosForm;
import com.concytec.bibliotecaapp.service.LoginForm;
import com.concytec.bibliotecaapp.service.SimpleRecursoManager;

@Controller
public class LibrosController {
	@RequestMapping(value = "/paginaLibros.html", method = RequestMethod.GET)
	public ModelAndView simpleForm(Map model) {
		LibrosForm librosForm = new LibrosForm();
		SimpleRecursoManager recurso = new SimpleRecursoManager();
		List<Recurso> listaRecursos  = recurso.getListRecurso();
		for(Recurso aut : listaRecursos)
		{
			System.out.println(aut.getTitRec()+ " " +aut.getIdeRec());			
		}
		Recurso tem = listaRecursos.get(1);
		model.put("librosForm", librosForm);
		//model.put("listaRecursos", tem);
		model.put("listaRecursos", listaRecursos);
//		return "paginaLibros";
		return new ModelAndView("paginaLibros","model",model);
	  }
	

	
	@RequestMapping(value = "/paginaLibros.html", method = RequestMethod.POST)
	public ModelAndView processForm(LibrosForm librosForm, BindingResult result,
			Map model) {
		  
		if (result.hasErrors()) {
			return new ModelAndView("loginform",model);
		}
		
		// Obtenmos los valores ingresados en la vista
		librosForm = (LibrosForm) model.get("librosForm");
//		System.out.println(+librosForm.getCodLibro());
		
		// Obtenemos todos los recursos de la BD
		SimpleRecursoManager recurso = new SimpleRecursoManager();
		List<Recurso> listaRecursos  = recurso.getListRecurso();
		
		// Filtramos los recursos por alguna restriccion: codig, titulo o autor
		Map<String, Object> myModel = new HashMap<String, Object>();
		List<Recurso> listaCoincidencias = new ArrayList< Recurso>();
		
		for(Recurso aut : listaRecursos)
		{
			String codigoLibro = aut.getIdeRec()+"";
			//filtro por codigo de recurso
			if(codigoLibro.equals(librosForm.getCodLibro())){
//				System.out.println(aut.getTitRec()+ " " +aut.getIdeRec());
				listaCoincidencias.add(aut);
			}
		}
		
		//Asignamos a la tabla Hash los recursos filtrados
		myModel.put("listaRecursos", listaCoincidencias);
		return new ModelAndView("paginaLibros","model",myModel);
	}
}
