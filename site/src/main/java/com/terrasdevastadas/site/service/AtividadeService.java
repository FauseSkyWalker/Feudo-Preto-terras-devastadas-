package com.terrasdevastadas.site.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terrasdevastadas.site.model.Atividade;
import com.terrasdevastadas.site.repository.AtividadeRepository;

@Service
public class AtividadeService {
	
	@Autowired
	private AtividadeRepository atividadeRepository;
	
	 public List<Atividade> getAllAtividades(){

	        return atividadeRepository.findAll();
	    }
	 
	 public Optional<Atividade> getById(Long id){

	        return atividadeRepository.findById(id);
	    }
	 
	 
	  public Atividade create(Atividade atividade){

	        return atividadeRepository.save(atividade);
	    }
	 
	  
//	  public Atividade update (Atividade atividade, Long id){
//		  
//	        Usuario newatividade = atividadeRepository.findById(id).get();
//	 
//	        if (Objects.nonNull(atividade.getNome()) && !"".equalsIgnoreCase(
//	        		atividade.getNome())){newAtividade.setNome(atividade.getNome());
//	        }
//	 
//
//	        if (Objects.nonNull(atividade.getEmail()) && !"".equalsIgnoreCase(
//	        		atividade.getEmail())){newAtividade.setEmail(atividade.getEmail());
//	        }
//	 
//
//	        if (Objects.nonNull(atividade.getSenha()) && !"".equalsIgnoreCase(
//	        		atividade.getSenha())){newAtividade.setSenha(atividade.getSenha());
//	        }
//	 
//	        return atividadeRepository.save(newAtividade);
//	    }
	  
	 
	  public void delete (Long id){

		  atividadeRepository.deleteById(id);
	   }

}
