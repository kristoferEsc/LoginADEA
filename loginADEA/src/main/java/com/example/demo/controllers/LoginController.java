package com.example.demo.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.models.entity.UsuarioADEA;
import com.example.demo.models.service.IUsuarioadeaService;

@Controller
public class LoginController {

	@Autowired
	private IUsuarioadeaService usuarioadeaService;
	
	@GetMapping("/auth/login")
	public String login(Model model) {
		model.addAttribute("usuario", new UsuarioADEA());
		return "login";
	}
	
	@GetMapping("/auth/registro")
	public String registroForm(Model model) {
		model.addAttribute("usuario", new UsuarioADEA());
		return "registro";
	}
	
	@PostMapping("/auth/registro")
	public String registro(@Validated @ModelAttribute UsuarioADEA usuario, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			return "redirect:/auth/registro";
		}else {
			model.addAttribute("usuario", usuarioadeaService.registrar(usuario));
		}
		return "redirect:/auth/login";
	}
	
}
