package spotify;

public class Musica {

	private String nome, artista;
	private int ano, duracao, numeroReproducoes;
	private Generos genero;

	public Musica(String nome, String artista, int ano, int duracao, int numeroReproducoes, Generos genero) {

		this.nome = nome;
		this.artista = artista;
		this.ano = ano;
		this.duracao = duracao;
		this.numeroReproducoes = numeroReproducoes;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public String getArtista() {
		return artista;
	}

	public int getAno() {
		return ano;
	}

	public int getDuracao() {
		return duracao;
	}

	public int getNumeroReproducoes() {
		return numeroReproducoes;
	}

	public void setNumeroReproducoes(int n) {
		numeroReproducoes = n;
	}

	public Generos getGenero() {
		return genero;
	}

}
