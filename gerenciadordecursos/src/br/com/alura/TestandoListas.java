package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhando com cursos e sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		
		System.out.println(aulas);
		
		aulas.remove(0);
		
		System.out.println(aulas);
		
		//forEach no Java//
		for (String aula : aulas) {
			System.out.println("aula: " + aula);
		}
		
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula eh: " + primeiraAula);
		
		String segundaAula = aulas.get(1);
		System.out.println("A segunda aula eh: " + segundaAula);
		
		for(int i = 0; i < aulas.size(); i++) {
			System.out.println("aula : " + aulas.get(i));
		}
				
		System.out.println(aulas.size());
		//Lambda > para cada aula dentro de aulas o que voce quer que faca?
		
		aulas.forEach(aula -> {
			System.out.println("percorrendo: ");
			System.out.println("Aula: " + aula);});
		
		aulas.add("Aumentando o nosso conhecimento");
		System.out.println("Antes do Sort : " + aulas);
		Collections.sort(aulas);
		
		System.out.println("Depois do Sort : " + aulas);
	}
	
}
