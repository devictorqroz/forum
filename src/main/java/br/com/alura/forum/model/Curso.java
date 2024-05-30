package br.com.alura.forum.model;

public class Curso {

	private Long id;
	private String nome;
	private String subcategoria;

	// construtor default exigido pela JPA
	protected Curso() {
	}

	public Curso(String nome, String subcategoria) {
		this.nome = nome;
		this.subcategoria = subcategoria;
	}

//	public Curso(String nome, Subcategoria subcategoria) {
//		this.nome = nome;
//		this.subcategoria = subcategoria;
//	}

	// getters
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getSubcategoria() {
		return subcategoria;
	}

}
