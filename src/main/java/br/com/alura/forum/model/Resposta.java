package br.com.alura.forum.model;

import java.time.LocalDateTime;

public class Resposta {

	private Long id;
	private LocalDateTime data = LocalDateTime.now();
	private String mensagem;
	private Boolean solucao = false;
	private Topico topico;
	private Usuario dono;

	// construtor default exigido pela JPA
	protected Resposta() {
	}

	public Resposta(String mensagem, Topico topico, Usuario dono) {
		this.mensagem = mensagem;
		this.topico = topico;
		this.dono = dono;
	}

	// getters
	public Long getId() {
		return id;
	}

	public LocalDateTime getData() {
		return data;
	}

	public String getMensagem() {
		return mensagem;
	}

	public Boolean getSolucao() {
		return solucao;
	}

	public Topico getTopico() {
		return topico;
	}

	public Usuario getDono() {
		return dono;
	}

}
