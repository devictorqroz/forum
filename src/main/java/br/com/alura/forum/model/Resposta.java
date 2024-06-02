package br.com.alura.forum.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Resposta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String mensagem;

	@ManyToOne
	private Topico topico;
	private LocalDateTime data = LocalDateTime.now();
	@ManyToOne
	private Usuario dono;
	private Boolean solucao = false;

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
