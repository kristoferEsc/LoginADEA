package com.example.demo.impl;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.models.dao.IUsuarioadeaDAO;
import com.example.demo.models.entity.UsuarioADEA;
import com.example.demo.models.service.IUsuarioadeaService;

@Service
public class UsuarioadeaServiceImpl implements IUsuarioadeaService{

	@Autowired
	private BCryptPasswordEncoder passEncoder;
	
	@Autowired
	private IUsuarioadeaDAO usuarioadeaDAO;
	
	@Override
	public UsuarioADEA findByLoginUsuario(String loginUsuario) {
		return usuarioadeaDAO.findByLoginUsuario(loginUsuario);
	}

	@Override
	public UsuarioADEA registrar(UsuarioADEA usuario) {
		usuario.setPassUsuario(passEncoder.encode(usuario.getPassUsuario()));
		usuario.setFecha_vigencia(sumarMesFecha(new Date(), 1));
		return usuarioadeaDAO.save(usuario);
	}

	@Override
	public UsuarioADEA cambioPass(UsuarioADEA usuario) {
		UsuarioADEA usuarioObtenido = usuarioadeaDAO.findByLoginUsuario(usuario.getLoginUsuario());
		usuarioObtenido.setPassUsuario(passEncoder.encode(usuario.getPassUsuario()));
		return usuarioadeaDAO.save(usuarioObtenido);
	}
	
	
	public Date sumarMesFecha(Date fecha, int meses) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fecha);
		calendar.add(Calendar.MONTH, meses);
		return calendar.getTime();
	}

}
