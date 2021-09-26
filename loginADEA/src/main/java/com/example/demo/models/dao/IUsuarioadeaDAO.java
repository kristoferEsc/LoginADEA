package com.example.demo.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.entity.UsuarioADEA;

@Repository
public interface IUsuarioadeaDAO extends JpaRepository<UsuarioADEA, Long>{
	
	public UsuarioADEA findByLoginUsuario(String loginUsuario);

}
