package br.com.alura.forum.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private Long id;
	private String nome;
	private String email;
	private String senha;
	private List<Perfil> perfis = new ArrayList<>();

	// construtor default exigido pela JPA
	protected Usuario() {
	}

	public Usuario(String nome, String email, String senha, List<Perfil> perfis) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.perfis.addAll(perfis);
	}

	// getters
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	public List<Perfil> getPerfis() {
		return perfis;
	}

}
