package com.example.demo.security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.models.dao.IUsuarioadeaDAO;
import com.example.demo.models.entity.UsuarioADEA;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private IUsuarioadeaDAO usuarioadeaDAO;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UsuarioADEA usuario = usuarioadeaDAO.findByLoginUsuario(username);
		UserBuilder userBuilder = null;
		
		if(usuario != null) {
			userBuilder = User.withUsername(username);
			userBuilder.disabled(false);
			userBuilder.password(usuario.getPassUsuario());
			userBuilder.authorities(new SimpleGrantedAuthority("ROLE_USER"));
			
		}else {
			throw new UsernameNotFoundException("El usuario ingresado no existe");
		}
		
		return userBuilder.build();
	}

}
