package com.terrasdevastadas.site.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terrasdevastadas.site.model.Usuario;
import com.terrasdevastadas.site.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	 public List<Usuario> getAllUsuarios(){

	        return usuarioRepository.findAll();
	    }
	

}
