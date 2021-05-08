package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
	
	public static void main(String[] args) {
		Aula a1 = new Aula("Revisitando as arrayList", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("relacionamento de listas de objetos",  15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		System.out.println("Usando Collections.sort: ");
		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println("Usando o metodo aulas.sort: ");
		System.out.println(aulas);
		
		
	}

}
