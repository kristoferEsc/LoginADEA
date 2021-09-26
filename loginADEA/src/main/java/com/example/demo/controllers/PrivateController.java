package com.example.demo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.entity.UsuarioADEA;
import com.example.demo.models.service.IUsuarioadeaService;

@Controller
@RequestMapping("/private")
public class PrivateController {

	@Autowired
	private IUsuarioadeaService usuarioadeaService;
	
	@GetMapping("/index")
	public String index(Authentication auth, HttpSession session) {
		String nombreUsuario = auth.getName();
		
		if(session.getAttribute("usuario")== null) {
			UsuarioADEA usuario = usuarioadeaService.findByLoginUsuario(nombreUsuario);
			usuario.setPassUsuario(null);
			session.setAttribute("usuario", usuario);
		}
		
		return "index";
	}
}
