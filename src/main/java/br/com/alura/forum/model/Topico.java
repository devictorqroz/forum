package br.com.alura.forum.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Topico {

	private Long id;
	private LocalDateTime data = LocalDateTime.now();
	private String titulo;
	private String mensagem;
	private Curso curso;
	private Usuario dono;
	private List<Resposta> respostas = new ArrayList<>();
	private StatusTopico status = StatusTopico.NAO_RESPONDIDO;

	// construtor default exigido pela JPA
	protected Topico() {
	}

	public Topico(String titulo, String mensagem, Curso curso, Usuario dono) {
		this.titulo = titulo;
		this.mensagem = mensagem;
		this.curso = curso;
		this.dono = dono;
	}

	// getters
	public Long getId() {
		return id;
	}

	public LocalDateTime getData() {
		return data;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public Curso getCurso() {
		return curso;
	}

	public Usuario getDono() {
		return dono;
	}

	public List<Resposta> getRespostas() {
		return respostas;
	}

	public StatusTopico getStatus() {
		return status;
	}

}
