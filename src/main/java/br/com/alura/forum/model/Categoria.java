package br.com.alura.forum.model;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

	private Long id;
	private String nome;
	private List<Subcategoria> subcategorias = new ArrayList<>();

	// construtor default exigido pela JPA
	protected Categoria() {
	}

	public Categoria(String nome) {
		this.nome = nome;
	}

	// getters
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public List<Subcategoria> getSubcategorias() {
		return subcategorias;
	}

}
