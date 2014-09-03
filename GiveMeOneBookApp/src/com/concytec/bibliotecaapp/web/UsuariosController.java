package com.concytec.bibliotecaapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.concytec.bibliotecaapp.service.LoginForm;

@Controller
public class UsuariosController {
	@RequestMapping(value = "/paginaUsuarios.html", method = RequestMethod.GET)
	public void simpleForm(Model model) {
		   //model.addAttribute(new Estudiante());
	  }
	
	@RequestMapping(value = "/paginaUsuarios.html", method = RequestMethod.POST)
	public void simple(@ModelAttribute LoginForm loginForm, Model model) {
		   //model.addAttribute("estudiante", estudiante);
	}
}
