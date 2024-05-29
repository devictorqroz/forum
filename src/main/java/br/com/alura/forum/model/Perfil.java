package br.com.alura.forum.model;

public class Perfil {

	private Long id;
	private String nome;

	// construtor default exigido pela JPA
	protected Perfil() {
	}

	public Perfil(String nome) {
		this.nome = nome;
	}

	// getters
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

}
