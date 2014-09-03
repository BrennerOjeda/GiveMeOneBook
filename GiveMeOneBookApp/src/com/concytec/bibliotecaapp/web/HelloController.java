package com.concytec.bibliotecaapp.web;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.concytec.bibliotecaapp.domain.Usuario;
import com.concytec.bibliotecaapp.service.SimpleUsuarioManager;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.concytec.bibliotecaapp.domain.Autor;
import com.concytec.bibliotecaapp.domain.TipoUsuario;
import com.concytec.bibliotecaapp.service.SimpleAutorManager;
import com.concytec.bibliotecaapp.service.SimpleCategoriaManager;
import com.concytec.bibliotecaapp.service.SimpleRecursoManager;
import com.concytec.bibliotecaapp.service.SimpleTipoUsuarioManger;
import com.concytec.bibliotecaapp.service.SimpleUsuarioManager;
@Controller
public class HelloController {

    protected final Log logger = LogFactory.getLog(getClass());
    
    
    private SimpleUsuarioManager usuario;
    
    @RequestMapping(value="/login.html")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	usuario = new SimpleUsuarioManager();		
		List<Usuario> usuarioList  = usuario.getListUsuarios();
    	
		
		
        String now = (new Date()).toString();
        logger.info("Returning hello view with " + now);
        System.out.println("aaaaaaaaaaaasf");
        return new ModelAndView("login", "now", now);

    }
}