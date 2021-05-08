package br.com.alura;

import java.util.LinkedList;
import java.util.List;

// A razao de usar List ao inves de ArrayList eh que podemos encapsular
public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();

	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return aulas;
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

}
