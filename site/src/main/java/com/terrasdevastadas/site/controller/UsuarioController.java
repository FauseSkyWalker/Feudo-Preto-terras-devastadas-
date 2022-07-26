package com.terrasdevastadas.site.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.terrasdevastadas.site.dto.UsuarioDTO;
import com.terrasdevastadas.site.model.Usuario;
import com.terrasdevastadas.site.service.UsuarioService;

/*
 * O Controller é responsável por processar as requests(Get, Post, Put, Delete...) recebidas da API, 
 * além disso ela prepara o modelo e retorna a visualização que vai ser mostrada como resposta.
 * @RequestMapping é responsável por determinar o endpoint(URL) geral das requests que estão presentes na classe. Este está indicado no paramêtro value.
 */
@RequestMapping(value = "/terrasdevastadas")
@RestController //Anotação responsável por simplificar a criação de api's RESTful para serviços web.
public class UsuarioController {
	
	@Autowired //Essa é muito complicada de explicar rápido porque tem muitos termos relacionados, como beans e injeção de dependência. 
    private UsuarioService usuarioService;

    @GetMapping("/")
    public ResponseEntity<List<Usuario>> getAllUsuarios(){

        List<Usuario> usuario = usuarioService.getAllUsuarios();
        return new ResponseEntity<>(usuario, usuario == null  || usuario.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    }
    
    @GetMapping(value = {"/{id}"})
    public ResponseEntity<Optional<Usuario>> getById(@PathVariable Long id){

        Optional<Usuario> usuario = usuarioService.getById(id);
        return new ResponseEntity<>(usuario, usuario == null  || usuario.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    }
    
    
    @PostMapping(value = "/")
    public ResponseEntity<Usuario> addUsuario(@RequestBody UsuarioDTO usuarioDTO){

       return new ResponseEntity<>(usuarioService.CadastrarUsuario(usuarioDTO), HttpStatus.OK);
    }
    
    @PutMapping(value="/{id}")
    public ResponseEntity<Usuario> update(@RequestBody Usuario usuario, @PathVariable Long id){

        return new ResponseEntity<>(usuarioService.update(usuario, id), HttpStatus.OK);
    }
    
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<List<Usuario>> deleteById(@PathVariable Long id){

        usuarioService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
