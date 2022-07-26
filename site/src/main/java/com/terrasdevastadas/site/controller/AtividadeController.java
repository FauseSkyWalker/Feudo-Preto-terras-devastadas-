package com.terrasdevastadas.site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.terrasdevastadas.site.model.Atividade;
import com.terrasdevastadas.site.service.AtividadeService;

@RequestMapping(value = "/atividade")
@RestController
public class AtividadeController {
	
	@Autowired
    private AtividadeService atividadeService;

    @GetMapping("/")
    public ResponseEntity<List<Atividade>> getAllAtividades(){

        List<Atividade> atividade = atividadeService.getAllAtividades();
        return new ResponseEntity<>(atividade, atividade == null  || atividade.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
    }
    
//    @GetMapping(value = {"/{id}"})
//    public ResponseEntity<Optional<Usuario>> getById(@PathVariable Long id){
//
//        Optional<Usuario> usuario = usuarioService.getById(id);
//        return new ResponseEntity<>(usuario, usuario == null  || usuario.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
//    }
    
    @PostMapping(value = "/")
    public ResponseEntity<Atividade> add(@RequestBody Atividade atividade){

       return new ResponseEntity<>(atividadeService.create(atividade), HttpStatus.OK);
    }
    
//    @PutMapping(value="/{id}")
//    public ResponseEntity<Usuario> update(@RequestBody Usuario usuario, @PathVariable Long id){
//
//        return new ResponseEntity<>(usuarioService.update(usuario, id), HttpStatus.OK);
//    }
    
//    @DeleteMapping(value = "/{id}")
//    public ResponseEntity<List<Usuario>> deleteById(@PathVariable Long id){
//
//        usuarioService.delete(id);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }

}
