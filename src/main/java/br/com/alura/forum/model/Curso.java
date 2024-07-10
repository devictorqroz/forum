package br.com.alura.forum.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String subcategoria;

	// construtor default exigido pela JPA
	public Curso() {
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

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSubcategoria(String subcategoria) {
		this.subcategoria = subcategoria;
	}
}
