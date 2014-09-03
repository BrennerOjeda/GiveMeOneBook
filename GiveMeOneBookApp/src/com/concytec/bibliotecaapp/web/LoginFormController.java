package com.concytec.bibliotecaapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.validation.BindingResult;

import com.concytec.bibliotecaapp.domain.Usuario;
import com.concytec.bibliotecaapp.service.LoginForm;
import com.concytec.bibliotecaapp.service.SimpleUsuarioManager;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

@Controller
@RequestMapping("loginform.html")
public class LoginFormController {

	@RequestMapping(method = RequestMethod.GET)
	public String showForm(Map model) {
		LoginForm loginForm = new LoginForm();
		model.put("loginForm", loginForm);
		return "loginform";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView processForm(@Valid LoginForm loginForm, BindingResult result,
			Map model) {
		if (result.hasErrors()) {
			return new ModelAndView("loginform",model);
		}
		
		loginForm = (LoginForm) model.get("loginForm");
		//System.out.println(loginForm.getUserName() +" "+loginForm.getPassword());
		SimpleUsuarioManager newusuario = new SimpleUsuarioManager();
		
		if( newusuario.existUser(loginForm.getUserName(), loginForm.getPassword()) ){
			Usuario usuario = newusuario.login( loginForm.getUserName(), loginForm.getPassword() );
			Map<String, Object> myModel = new HashMap<String, Object>();
			myModel.put("usuario", usuario);
			return new ModelAndView("loginsuccess", "loginForm", myModel);
		}
		else{
			return new ModelAndView("loginform",model);
		}
		

	}
	
}
