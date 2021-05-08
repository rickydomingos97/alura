package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", 
				"Paulo silveria");
		
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArraysList no java", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com arraylist no java", 22));
		//List<Aula> aulas = javaColecoes.getAulas();
		//System.out.println(aulas);
		
		//aulas.add(new Aula("trabalhando com arrayList no Java", 21));
		//System.out.println(aulas);
		
		System.out.println(javaColecoes.getAulas());
		
			
	}

}
