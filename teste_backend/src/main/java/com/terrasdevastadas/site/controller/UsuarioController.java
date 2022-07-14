package com.terrasdevastadas.site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.terrasdevastadas.site.model.Usuario;
import com.terrasdevastadas.site.service.UsuarioService;

@RequestMapping(value = "/terrasdevastadas")
@RestController
public class UsuarioController {
	
	@Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public ResponseEntity<List<Usuario>> getAllUsuarios(){

        List<Usuario> usuario = usuarioService.getAllUsuarios();
        return new ResponseEntity<>(usuario, usuario == null  || usuario.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    }

}
