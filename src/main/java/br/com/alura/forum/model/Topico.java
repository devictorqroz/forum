package br.com.alura.forum.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Topico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime data = LocalDateTime.now();
	@Enumerated(EnumType.STRING)
	private StatusTopico status = StatusTopico.NAO_RESPONDIDO;
	@ManyToOne
	private Curso curso;
	@ManyToOne
	private Usuario dono;
	@OneToMany(mappedBy = "topico")
	private List<Resposta> respostas = new ArrayList<>();

	// construtor default exigido pela JPA
	protected Topico() {
	}


	public Topico(String titulo, String mensagem, Curso curso, Usuario dono) {
		this.titulo = titulo;
		this.mensagem = mensagem;
		this.curso = curso;
		this.dono = dono;
	}

	public Topico(String titulo, String mensagem, Curso curso) {
		this.titulo = titulo;
		this.mensagem = mensagem;
		this.curso = curso;
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
