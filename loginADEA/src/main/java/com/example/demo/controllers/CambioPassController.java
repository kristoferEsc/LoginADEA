package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.models.entity.UsuarioADEA;
import com.example.demo.models.service.IUsuarioadeaService;

@Controller
public class CambioPassController {
	
	@Autowired
	private IUsuarioadeaService usuarioadeaService;

	@GetMapping("/auth/cambioPass")
	public String cambioForm(Model model) {
		model.addAttribute("usuar", new UsuarioADEA());
		return "index";
	}
	
	@PostMapping("/auth/cambioPass/{login}")
	public String cambio(@Validated @PathVariable String login) {
		
		return "redirect:/auth/login";
	}
	
}
