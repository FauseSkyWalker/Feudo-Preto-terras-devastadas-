package com.terrasdevastadas.site.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/*
 * A anotação @Entity é utilizada para declarar uma entidade no projeto. As entidades, por sua vez, representam uma tabela do banco de dados.
 */
@Entity
@Table(name="tb_usuarios", schema="terras_devastadas") //@Table indica a qual tabela a classe se refere
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //@GeneratedValu indica para o programa que o id será gerado pelo seu "provedor de persistência". Já a strategy define como essa geração será feita.
	private Long id;

	@NotNull //Indica que aquele campo não pode ser nulo
	private String nome;
	
	@NotNull
	private String email;
	
	@NotNull
	private String senha;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
