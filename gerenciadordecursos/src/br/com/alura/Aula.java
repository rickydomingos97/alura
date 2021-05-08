package br.com.alura;

public class Aula implements Comparable<Aula>{
	
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	/*
	 * Quando herdamos um metodo da mae e nao queremos usar ele o que fazemos?
	 * reescrevemos o toString
	 * Nao vamos retornar o que a mae retorna, vamos trocar por uma String
	 * trocamos o return super.toString(); por 
	 */
	@Override
	public String toString() {
		return "[Aula " + this.titulo + ", " + this.tempo + " minutos ]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}
	 
	
}
